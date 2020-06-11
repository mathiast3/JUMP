package com.cognixia.jump.fullstack.cardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BlackjackConsole {

	private static Deck deck;
	private static List<Card> player;
	private static List<Card> house;
	private static boolean playAgain = true;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner input = new Scanner(System.in)) {
			
			System.out.println("Welcome to Modern Blackjack!\n");
			System.out.println("Press enter to start!");
			input.nextLine();
			while(playAgain) {
				startGame(input);
				System.out.println("\nPlay again? \n Y or N");
				String res = input.next();
				res = res.toLowerCase();
				playAgain = res.contentEquals("y") ? true:false;
			}
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

	private static void startGame(Scanner input) {
		// Create new card deck & hands
		deck = new Deck();
		player = new ArrayList<>();
		house = new ArrayList<>();
		
		//deal each player 2 hands
		deal(player);
		deal(house);
		
		int playerSum = playerTurn(input);
		int houseSum = houseTurn();
		
		System.out.print("Your ");
		showCards(player);
		
		System.out.print("\nHouse ");
		showCards(house);
		
		if(playerSum<22 && playerSum>houseSum) {
			System.out.println("Congrats! YOU WIN!!!");
		}else if(playerSum==houseSum){
			System.out.println("Draw, Push to next game");
		} else {
			System.out.println("You Lose");
		}
	}

	private static int houseTurn() {
		//dealer must stand on 17 and up
		while(getSum(house)<17) {
			house.add(deck.drawCard());
		}
		return getSum(house);
	}
	
	private static int playerTurn(Scanner input) {
		boolean isTurn = true;
		while(isTurn) {
			showCards(player);
			if(getSum(player)>21) {
				isTurn = false;
				System.out.println("Bust! ");
				continue;
			}
			System.out.println("\nYour total sum: " +getSum(player));
			showOptions();
			int res = input.nextInt();
			if(res == 1) {
				player.add(deck.drawCard());
			}else if(res == 2) {
				//house turn
				isTurn = false;
			}
		}
		return getSum(player);
	}

	private static String getRank(int num) {
		int rank = num%13;
		if(rank == 0 ) return "A";
		if(rank == 10) return "J";
		if(rank == 11) return "Q";
		if(rank == 12) return "K";
		
		//return the value if its not a face card
		return Integer.toString(rank+1);
	}

	private static void showOptions() {
		System.out.println("Choose an option");
		System.out.println("1. Hit");
		System.out.println("2. Stand");
	}

	private static void showCards(List<Card> hand) {
		System.out.println("Cards:");
		for(Card card:hand) {
			System.out.println(getRank(card.getRank())+" of "+card.getSuit());
		}
	}

	private static void deal(List<Card> hand) {
		//draw 2 cards to start
		hand.add(deck.drawCard());
		hand.add(deck.drawCard());
	}
	
	//Gets the total of the hands cards
	private static int getSum(List<Card> hand) {
		int sum = 0;
		boolean containsA = false;
		for(Card card:hand) {
			String rank = getRank(card.getRank());
			//check for face cards
			if(rank.equals("K") || rank.equals("Q") || rank.equals("J"))sum+=10;
			else if(rank.equals("A")) {sum+=11; containsA =true;}
			else sum+=Integer.parseInt(rank);
		}
		//check if Ace is 1 or 11
		if(containsA && sum>21)sum-=10;
		return sum;
	}

}
