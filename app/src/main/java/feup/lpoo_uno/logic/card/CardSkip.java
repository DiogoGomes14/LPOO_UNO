package feup.lpoo_uno.logic.card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:11
 */
public class CardSkip extends ActionCard {

    /**
     * @param color
     */
	public CardSkip(Color color) {
		super(color);
	}

	@Override
	public String doAction() {
		return "CardSkip";
		
	}

}