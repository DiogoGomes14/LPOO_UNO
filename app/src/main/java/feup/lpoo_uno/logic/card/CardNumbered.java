package feup.lpoo_uno.logic.card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:10
 */
public class CardNumbered extends ColoredCard {

    /**
     *
     */
    private int number;

    /**
     * @param number
     * @param color
     */
	public CardNumbered(int number, Color color){
        super(number, color);
		this.number = number;
	}

	@Override
	public String doAction() {
		return "CardNumbered";
		// TODO Auto-generated method stub
		
	}

}