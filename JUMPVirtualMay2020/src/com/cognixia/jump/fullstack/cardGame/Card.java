package com.cognixia.jump.fullstack.cardGame;

public class Card {
	private String suit;
	private int rank;
	
	public Card(String suit, int rank) {
		super();
		this.suit = suit;
		this.rank = rank;
	}

	public String getSuit() {
		return suit;
	}

	public int getRank() {
		return rank;
	}
	
}
