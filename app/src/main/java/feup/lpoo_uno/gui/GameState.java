package feup.lpoo_uno.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import feup.lpoo_uno.R;

/**
 * @author Sony
 * @version 1.0
 * @created 25-Mai-2015 15:48:12
 */
public abstract class GameState extends Activity implements View.OnClickListener {
    protected final String tag = "StatesNav";
    protected int state = 0;

	public GameState(){

	}

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag, "onRestart()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        //tv.setText("state = " + state);
        Log.i(tag, "onResume()");
    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(tag, "onRestoreInstanceState()");
        state = savedInstanceState.getInt("State");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag, "onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        Log.i(tag, "onSaveInstanceState()");
        outState.putInt("State", state);
        super.onSaveInstanceState(outState);
    }

    @Override
    public void onClick(View view) {

        state = 1;
        //tv.setText("state = " + state);
    }

    View.OnClickListener handler = new View.OnClickListener(){
        public void onClick(View v) {

        }
    };

}