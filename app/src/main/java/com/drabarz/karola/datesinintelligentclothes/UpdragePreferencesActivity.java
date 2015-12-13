package com.drabarz.karola.datesinintelligentclothes;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.rarepebble.colorpicker.ColorPickerView;


public class UpdragePreferencesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updrage_preferences);

        addListenersToPriorityColorButtons();
    }

    void addListenersToPriorityColorButtons() {
        Button upgradePreferencesPriorityOneButton = (Button) findViewById(R.id.upgradePreferencesPriorityOneButton);
        addListenerToPriorityColorButton(upgradePreferencesPriorityOneButton);
        Button upgradePreferencesPriorityTwoButton = (Button) findViewById(R.id.upgradePreferencesPriorityTwoButton);
        addListenerToPriorityColorButton(upgradePreferencesPriorityTwoButton);
        Button upgradePreferencesPriorityThreeButton = (Button) findViewById(R.id.upgradePreferencesPriorityThreeButton);
        addListenerToPriorityColorButton(upgradePreferencesPriorityThreeButton);
        Button upgradePreferencesPriorityFourButton = (Button) findViewById(R.id.upgradePreferencesPriorityFourButton);
        addListenerToPriorityColorButton(upgradePreferencesPriorityFourButton);
        Button upgradePreferencesPriorityFiveButton = (Button) findViewById(R.id.upgradePreferencesPriorityFiveButton);
        addListenerToPriorityColorButton(upgradePreferencesPriorityFiveButton);
    }

    void addListenerToPriorityColorButton(final Button button) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPaleteColor(button);
            }
        });
    }

    void setPaleteColor(Button button) {
        int color;
        ColorPickerView colorPickerView = (ColorPickerView) findViewById(R.id.colorPicker);
        color = colorPickerView.getColor();
        button.setBackgroundColor(color);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_updrage_preferences, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
