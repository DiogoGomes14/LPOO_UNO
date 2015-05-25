package feup.lpoo_uno.Logic.Core;

import feup.lpoo_uno.Logic.Card.Card;
import feup.lpoo_uno.Logic.CardList.Hand;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:15
 */
public class Player {

	private Hand Hand;
	private String name;

	public Player(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param name
	 */
	Player(String name){

	}

	Card[] getCards(){
		return null;
	}

	/**
	 * 
	 * @param card
	 */
	boolean addCard(Card card){
		return false;
	}

	/**
	 * 
	 * @param index
	 */
	public boolean useCard(Card index){
		return false;
	}

}