package feup.lpoo_uno.Logic.CardList;
import java.util.ArrayList;

import feup.lpoo_uno.Logic.Card.Card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:10
 */
public abstract class CardList {

	protected ArrayList<Card> cardList;

	public CardList(ArrayList<Card> cards){
		this.cardList = cards;
	}

	public ArrayList<Card> getCards(){
		return cardList;
	}

	/**
	 *
	 * @param card
	 */
	public void addCard(Card card){
		this.cardList.add(card);
	}

	public Card drawTopCard(){
		return cardList.get(cardList.size() - 1);
	}

	public void finalize() throws Throwable {

	}

}