package feup.lpoo_uno.Logic.Core;

import feup.lpoo_uno.Logic.CardList.Deck;
import feup.lpoo_uno.Logic.CardList.PlayedCards;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:15
 */
public class Uno {

	private Player currentPlayer;
	private Deck deck;
	private PlayedCards playedCards = null;
	private Player[] players;
	/**
	 * enum : left, right
	 */
	private String orientation = "left";

	public Uno(){

	}

	public void finalize() throws Throwable {

	}

	public boolean mainLoop(){
		return false;
	}

	/**
	 * 
	 * @param player
	 * @param numberCards
	 */
	public boolean playerDraw(Player player, int numberCards){
		return false;
	}

	public String switchOrientation(){
		return "";
	}

	/**
	 * 
	 * @param player
	 */
	public boolean playerTurn(Player player){
		return false;
	}

}