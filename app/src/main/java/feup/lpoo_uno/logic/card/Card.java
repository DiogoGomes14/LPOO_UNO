package feup.lpoo_uno.logic.card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:08
 */
public abstract class Card implements ICard {

    /**
     * value of the card.
     */
    protected final int value;

    /**
     * Enumeration of the possible colors used by the cards
     */
    public enum Color {
        RED,
        YELLOW,
        GREEN,
        BLUE;
    }

    /**
     * @param value of the card
     */
	public Card(int value){
        this.value = value;
	}

    /**
     * @return value of the card
     */
    public int getValue() {
        return value;
    }

 
    
}