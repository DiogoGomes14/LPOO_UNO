package feup.lpoo_uno.Logic.Core;

import java.util.ArrayList;

import feup.lpoo_uno.Logic.Card.Card;
import feup.lpoo_uno.Logic.CardList.Hand;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:15
 */
public class Player {

	private Hand hand;
	private String name;

	public Player(Hand hand, String name){
		this.hand = hand;
		this.name = name;
	}

	public void finalize() throws Throwable {

	}

	ArrayList<Card> getHand(){
		return hand.getCards();
	}

	/**
	 *
     * @param card
     */
	void addCard(Card card){
		this.hand.addCard(card);
	}

	/**
	 * 
	 * @param index
	 */
	public Card useCard(int index){
		return this.hand.getCards().get(index);
	}

}