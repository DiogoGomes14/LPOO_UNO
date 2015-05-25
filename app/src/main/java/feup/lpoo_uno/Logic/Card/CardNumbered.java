package feup.lpoo_uno.Logic.Card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:10
 */
public class CardNumbered extends ColoredCard {

	private int number;

	public CardNumbered(int number){
		this.value = number;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}