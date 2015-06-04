package feup.lpoo_uno.gui;

import android.os.Bundle;

import feup.lpoo_uno.R;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:14
 */
public class PauseSettings extends GameState {

	public PauseSettings(){

	}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pause_settings);
    }

}