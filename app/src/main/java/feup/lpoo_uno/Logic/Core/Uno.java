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
     * Used to represent the possible states of the board: LEFT or RIGHT
     */
    private enum Orientation {
        LEFT,
        RIGHT
    }

    /**
     *
     */
	private Player currentPlayer;

    /**
     *
     */
	private Deck deck;

    /**
     *
     */
	private PlayedCards playedCards;

    /**
     *
     */
	private Player[] players;

    /**
     *
     */
    private Orientation orientation;

    public Uno(){
        playedCards = null;
        orientation = Orientation.LEFT;
    }

    public Uno(Deck deck){
        this.deck = deck;
        playedCards = null;
        orientation = Orientation.LEFT;
    }

    /**
     * @return
     */
    public boolean mainLoop(){ //TODO
        return false;
    }

    /**
     * @param players Players that will be participating in the game
     */
    public void initializePlayers(Player[] players){ //TODO limit number of players
        this.players = players;
        this.currentPlayer = players[new Random().nextInt()];
    }

	/**
	 * 
	 * @param playerIndex index of the player to draw the cards
	 * @param numberCards number of cards to be drawn
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

    /**
     * Switch the orientation of the board
     */
	public void switchOrientation(){
        this.orientation = (this.orientation == Orientation.RIGHT ? Orientation.LEFT : Orientation.LEFT);
	}

	/**
	 *
     * @param player
     */
	public void playerTurn(Player player){ //TODO verify continuity of the board
		this.currentPlayer = player;
	}

}