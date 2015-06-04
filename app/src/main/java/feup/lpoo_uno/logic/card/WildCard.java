package feup.lpoo_uno.logic.card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:16
 */
public abstract class WildCard extends Card {

	private Color colorChoosen = null;

    /**
     *
     */
	public WildCard(){
		super(50);
	}

	/**
	 * 
	 * @param color
	 */
	public void setColorChoosen(Color color){
		this.colorChoosen = color;
	}

	public Color getColorChoosen() {
		return colorChoosen;
	}
	
	

}