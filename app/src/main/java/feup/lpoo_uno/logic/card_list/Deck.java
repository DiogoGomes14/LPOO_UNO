package feup.lpoo_uno.logic.card_list;

import java.util.ArrayList;
import java.util.Random;

import Logic.Card.Card;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:11
 */
public class Deck extends CardList {

	/**
	 *
	 * @param cards
	 */
	public Deck(ArrayList<Card> cards){
		super(cards);
	}

    /**
     *
     */
    public void shuffle(){ //TODO check if correct (passed 2 tests)
        Card temp;
        int index;
        Random random = new Random();
        for (int i = this.cardList.size() - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = this.cardList.get(index);
            this.cardList.set(index, this.cardList.get(i));
            this.cardList.set(i, temp);
        }
    }

    /**
     * @param cards
     */
	public void setCards(ArrayList<Card> cards){

        this.cardList = cards;
    }

}