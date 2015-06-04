package feup.lpoo_uno.gui;

import android.os.Bundle;

import feup.lpoo_uno.R;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:12
 */
public class GameStart extends GameState {

    public GameStart(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_start);
    }

}