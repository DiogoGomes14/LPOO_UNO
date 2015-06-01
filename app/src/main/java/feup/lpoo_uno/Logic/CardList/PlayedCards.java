package feup.lpoo_uno.Logic.CardList;

import java.util.ArrayList;

import feup.lpoo_uno.Logic.Card.Card;

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
     * @param cards
     */
	public PlayedCards(ArrayList<Card> cards){
        super(cards);
        this.topCard = cardList.get(cardList.size() - 1);
        this.cardList.remove(cards.size() - 1);
	}

	@Override
	public Card drawTopCard() {
		topCard = super.drawTopCard();
		return topCard;
	}

    @Override
    public void addCard(Card card) {
        super.addCard(topCard);
        topCard = card;
    }
}