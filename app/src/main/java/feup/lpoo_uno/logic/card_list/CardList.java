package feup.lpoo_uno.logic.card_list;
import java.util.ArrayList;

import feup.lpoo_uno.logic.card.Card;


/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:10
 */
public abstract class CardList {

    /**
     * List of cards to be used
     */
	protected ArrayList<Card> cardList;

    /**
     * @param cards to initialize the list
     */
	public CardList(ArrayList<Card> cards){

		this.cardList = cards;
	}

    /**
     * @return The list of the cards
     */
	public ArrayList<Card> getCards(){
		return cardList;
	}
	
    /**
     * @return The list of the cards
     */
	public int getCardListSize(){
		return cardList.size();
	}

	/**
	 *
	 * @param card to add to list
	 */
	public void addCard(Card card){
		this.cardList.add(card);
	}

    /**
     * @return Card that is on the top of the list
     */
	public Card drawTopCard(){
		Card c = cardList.get(cardList.size() - 1);
		cardList.remove(cardList.size() - 1);
		
		return c;
	}

}