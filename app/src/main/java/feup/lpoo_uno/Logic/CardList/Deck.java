package feup.lpoo_uno.Logic.CardList;

import java.util.ArrayList;

import feup.lpoo_uno.Logic.Card.Card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:11
 */
public class Deck extends CardList {

	/**
	 *
	 * @param cards
	 */
	public Deck(ArrayList<Card> cards){
		super(cards);
	}

    public void shuffle(){ //TODO

    }

	public void setCards(ArrayList<Card> cards){
        this.cardList = cards;
    }

}