/**
 * 
 */
package com.lixing.app;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.lixing.app.CardApp.Card;

/**
 * @author lixing
 *
 */
public class PokerGameTest {

	/**
	 * Test method for {@link com.lixing.app.CardApp#doShuffle(int)}.
	 */
	@Test
	public void testDoShuffleInt() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.lixing.app.CardApp#doShuffle()}.
	 */
	@Test
	public void testDoShuffle() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.lixing.app.CardApp#getDeck()}.
	 */
	@Test
	public void testGetDeck() {
		//fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.lixing.app.CardApp#dealCard()}.
	 */
	@Test
	public void testDealCard() {
		CardApp play = new CardApp();
		assertNotNull(play);

		// Initialize and Shuffle
		play.doShuffle(0);

		// Check if all cards in the deck are available 
		ArrayList<Card> allCards = play.getDeck();
		for (Card card : allCards) {
			assertNotNull(card);
			assertTrue(card instanceof Card);
		}

	}

}
