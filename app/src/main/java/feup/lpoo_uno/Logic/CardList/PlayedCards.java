package feup.lpoo_uno.Logic.CardList;
import feup.lpoo_uno.Logic.Card.Card;
import feup.lpoo_uno.Logic.Core.Uno;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:14
 */
public class PlayedCards extends CardList {

	private Card topCard;
	public Uno m_Uno;

	public PlayedCards(){

	}

	public void finalize() throws Throwable {
		super.finalize();
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