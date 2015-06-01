package feup.lpoo_uno.Logic.CardList;
import java.util.ArrayList;

import feup.lpoo_uno.Logic.Card.Card;

/**
 * @author up201106586
 * @version 1.0
 * @created 25-Mai-2015 15:48:13
 */
public class Hand extends CardList {

    /**
     * @param cards List of the cards to use as a Hand
     */
	public Hand(ArrayList<Card> cards){
		super(cards);
	}

    /**
     * @param index index of card to be played
     * @return Card: card played
     */
	public Card useCard(int index){ //TODO Check if correct
        if(index < 0 || index >= cardList.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        Card c = this.cardList.get(index);
        this.cardList.remove(index);
        return c;
    }

}