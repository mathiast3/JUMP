package com.cognixia.jump.fullstack.cardGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {
	//deck of cards
	private List<Card> cards;
	private int size;
	
	private Random rand = new Random();
	//create deck and fill it with 52 cards
	public Deck() {
		cards = new ArrayList<>();
		fillDeck();
		size=52;
	}
	
	public Card drawCard() {
		Card card = cards.get(rand.nextInt(size--));
		cards.remove(card);
		return card;
	}


	private void fillDeck() {
		for(int i=0;i<52;i++) {
			if(i<13) {
				cards.add(new Card("Hearts",i));
			}else if(i>=13&&i<26) {
				cards.add(new Card("Diamonds",i));
			} else if(i>=26&&i<39){
				cards.add(new Card("Spades",i));
			} else {
				cards.add(new Card("Clubs",i));
			}
			//System.out.println(cards.get(i).getSuit()+" "+cards.get(i).getRank());
		}
	}
	

	
}
