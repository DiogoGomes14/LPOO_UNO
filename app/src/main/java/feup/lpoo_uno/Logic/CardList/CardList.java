package feup.lpoo_uno.Logic.CardList;
import feup.lpoo_uno.Logic.Card.Card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:10
 */
public abstract class CardList {

	private Card[] cardList;

	public CardList(){

	}

	public void finalize() throws Throwable {

	}

	Card[] getCards(){
		return null;
	}

	/**
	 * 
	 * @param card
	 */
	public boolean addCard(Card card){
		return false;
	}

	public Card drawTopCard(){
		return null;
	}

}