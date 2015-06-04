package feup.lpoo_uno.logic.card_list;

import java.util.ArrayList;

import feup.lpoo_uno.logic.card.Card;


/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:14
 */
public class PlayedCards extends CardList {

    /**
     *
     */
	private Card topCard;

    /**
     * @param card
     */
	public PlayedCards(Card card){
        super(new ArrayList<Card> ());
        this.topCard = card;
	}

    @Override
    public void addCard(Card card) {
        super.addCard(topCard);
        topCard = card;
    }
}