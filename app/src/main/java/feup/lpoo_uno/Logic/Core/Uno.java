package feup.lpoo_uno.Logic.Core;

import java.util.Random;

import feup.lpoo_uno.Logic.CardList.Deck;
import feup.lpoo_uno.Logic.CardList.PlayedCards;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:15
 */
public class Uno {

    /**
     * enum : left, right
     */
    private enum Orientation {
        LEFT,
        RIGHT
    }

	private Player currentPlayer;
	private Deck deck;
	private PlayedCards playedCards = null;
	private Player[] players;
    private Orientation orientation = Orientation.LEFT;

    public Uno(){

	}

    public Uno(Deck deck){
        this.deck = deck;
    }

    public void finalize() throws Throwable {

    }

    public void inicializePlayers(Player[] players){
        this.players = players;
        this.currentPlayer = players[new Random().nextInt()];
    }


	public boolean mainLoop(){
		return false;
	}

	/**
	 * 
	 * @param playerIndex
	 * @param numberCards
	 */
	public boolean playerDraw(int playerIndex, int numberCards){
		if(numberCards == 1 || numberCards == 2 || numberCards == 4){
            for (int i = 0; i < numberCards; i++){
                players[playerIndex].addCard(deck.drawTopCard());
            }
            return true;
        }
        else return false;
	}

	public void switchOrientation(){
        this.orientation = (this.orientation == Orientation.RIGHT ? Orientation.LEFT : Orientation.LEFT);
	}

	/**
	 *
     * @param player
     */
	public void playerTurn(Player player){
		this.currentPlayer = player;
	}

}