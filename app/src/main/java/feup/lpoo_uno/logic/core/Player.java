package feup.lpoo_uno.logic.core;

import java.util.ArrayList;

import feup.lpoo_uno.logic.card.Card;
import feup.lpoo_uno.logic.card_list.Hand;


/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:15
 */
public class Player {

	
    /**
     * Hand of the player. List of cards.
     */
	private Hand hand;

    /**
     * Name of the player
     */
	private final String name;

    /**
     * @param hand Initial hand of the player
     * @param name Name of the player
     */
	public Player(Hand hand, String name){ // TODO Check hand size
		this.hand = hand;
		this.name = name;
	}
	
	public Player(String name){
		this.name = name;
		this.hand = new Hand(new ArrayList<Card>());
	};

    /**
     * @return list of cards from the player hand
     */
    public ArrayList<Card> getHand(){
		return hand.getCards();
	}

	/**
	 *
     * @param card card to be added at the end of the player hand
     */
    public void addCard(Card card){ // TODO Check hand size
		this.hand.addCard(card);
	}


    /**
     * @param index location of the card to be used
     * @return Card to be used
     */
	public Card useCard(int index){ 
		
		if(index < 0 || index > hand.getCardListSize())
			throw new ArrayIndexOutOfBoundsException();
		
		Card c =  this.hand.getCards().get(index);
		 this.hand.getCards().remove(index);
		
		return c;

	}

}