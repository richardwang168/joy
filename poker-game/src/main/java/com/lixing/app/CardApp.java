package com.lixing.app;
/**
 * <pre>
 * 
 *  (1) It's not the shortest version, added some comments and some codes for possible extending work.
 * 
 *  (2) Considered the size of the program, only one test method has been implemented
 * 
 *  (3) No Exception logics introduced
 * 
 * @version 1.0
 * @author Lixing W.
 * created on April 19, 2018
 * 
 * </pre>
 */
import java.util.*;

public class CardApp {

	final static String[] suit = { "Club", "Spade", "Diamond", "Heart" };
	final static String[] values = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

	public class Card {
		private String suit;
		private String value;

		public Card(String suit, String value) {
			this.suit = suit;
			this.value = value;
		}

		public String showFace() {
			return this.suit + "-" + this.value;
		}
	}

	/*
	 * Working deck of cards
	 */
	ArrayList<Card> deck = new ArrayList<Card>();

	/*
	 * Just a stack in order for remembering what cards have been dealt with
	 * sequence, We can look back afterward, queue is also ok
	 */
	Stack<Card> memoStack = new Stack<Card>();

	public CardApp() {
		initDeck();
	}

	/**
	 * Initialize Deck of cards, which may be called from constructor 
	 * or when shuffling with a initializing 
	 */
	private void initDeck() {
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < values.length; j++) {
				this.deck.add(new Card(suit[i], values[j]));
			}
		}
	}

	/**
	 * Do shuffle with/without initializing the Deck, I don't think 
	 * the initializing is necessary for each time
	 * 
	 * Shuffle function is just borrowed from collection
	 * 
	 * @param initFlg
	 *            0: Initializing the Deck 1: Just do shuffling
	 */
	public void doShuffle(int initFlg) {
		if (initFlg == 0) {
			initDeck();
		}
		Collections.shuffle(this.deck);
	}

	/**
	 * Do shuffle with initializing the Deck
	 */
	public void doShuffle() {
		Collections.shuffle(this.deck);
	}

	/**
	 * Get all card objects list
	 * @return Return all cards list
	 */
	public ArrayList<Card> getDeck() {
		return deck;
	}

	/**
	 * Supposing there is a rule: 
	 * Always to deal a card from the top of the deck
	 *
	 * @return Return one card from the top of the rest cards deck
	 */
	public Card dealCard() {
		int index = 0;
		Card cardToDeal = deck.get(index);
		// Remove the card from the deck
		deck.remove(index);
		// Save the dealt card in memo stack in case
		memoStack.push(cardToDeal);
		return cardToDeal;
	}

	/**
	 * Main entry
	 * @param args from command-line......not used this time
	 */
	public static void main(String[] args) {
		CardApp play = new CardApp();

		// Initialize and Shuffle
		play.doShuffle(0);

		// Let's use a loop here to go through all the cards
		ArrayList<Card> allCards = play.getDeck();
		for (Card card : allCards) {
			System.out.println(card.showFace());
		}
		
		// Last but not least, Deal a card from the top of the deck and get it displayed
		System.out.println(">>>>>>>>");
		System.out.println(play.dealCard().showFace());
	}
}
