package feup.lpoo_uno.Logic.Card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:08
 */
public abstract class Card {

    protected enum Color {RED, YELLOW, GREEN, BLUE}

	protected int value;

	public Card(){

	}

	public void finalize() throws Throwable {

	}

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}