package feup.lpoo_uno.Logic.CardList;
import java.util.ArrayList;

import feup.lpoo_uno.Logic.Card.Card;

/**
 * @author up201106586
 * @version 1.0
 * @created 25-Mai-2015 15:48:13
 */
public class Hand extends CardList {

	public Hand(ArrayList<Card> cards){
		super(cards);
	}

	public Card useCard(int index){ //TODO error handling
        return this.cardList.get(index);
    }

}