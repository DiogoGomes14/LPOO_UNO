package feup.lpoo_uno.gui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import feup.lpoo_uno.R;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:15
 */
public class Settings extends GameState {

	public Settings(){

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        findViewById(R.id.button_return_main_menu).setOnClickListener(handler);
        findViewById(R.id.button_settings_1).setOnClickListener(handler);
    }

    View.OnClickListener handler = new View.OnClickListener(){
        public void onClick(View v) {

            switch (v.getId()) {

                case R.id.button_return_main_menu:
                    // doStuff
                    startActivity(new Intent(Settings.this, MainMenu.class));
                    break;
                case R.id.button_settings_1:
                    // doStuff
                    finish();
                    Log.i(tag, "Button_Settings_1");
                    break;
            }
        }
    };

}