package com.drabarz.karola.datesinintelligentclothes;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.drabarz.karola.datesinintelligentclothes.model.ScaleColor;
import com.drabarz.karola.datesinintelligentclothes.model.UserPreferences;
import com.rarepebble.colorpicker.ColorPickerView;

import java.util.ArrayList;


public class UpdragePreferencesActivity extends BaseActivity {

    ViewPager viewPager;
    FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_updrage_preferences;
    }

    @Override
    protected int getCoordinatorLayout() {
        return R.id.upgradePreferencesLayout;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addListenersToButtons();
    }

    void addListenersToButtons() {
        addListenersToPriorityColorButtons();
        addListenerToSaveChangesButton();
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

    void addListenerToSaveChangesButton() {
        Button upgradePreferencesSaveChangesButton = (Button) findViewById(R.id.upgradePreferencesSaveChangesButton);
        upgradePreferencesSaveChangesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savePreferencesChange();
            }
        });
    }

    //TODO: save to storage
    void savePreferencesChange() {
        savePreferencesToModel();
        saveModelOnStorage();
        Snackbar.make(findViewById(R.id.upgradePreferencesLayout), R.string.changes_saved, Snackbar.LENGTH_LONG).show();
    }

    void savePreferencesToModel() {
        ArrayList<ScaleColor> scaleColors = getchoosenColors();
        UserPreferences userPreferences = model.getUserPreferences();
        userPreferences.setScaleColors(scaleColors);
        model.setUserPreferences(userPreferences);
    }
    ArrayList<ScaleColor> getchoosenColors() {
        ArrayList<ScaleColor> scaleColors = new ArrayList<>();

        Button upgradePreferencesPriorityOneButton = (Button) findViewById(R.id.upgradePreferencesPriorityOneButton);
        scaleColors.add(new ScaleColor(upgradePreferencesPriorityOneButton.getSolidColor(), 1.0));
        Button upgradePreferencesPriorityTwoButton = (Button) findViewById(R.id.upgradePreferencesPriorityTwoButton);
        scaleColors.add(new ScaleColor(upgradePreferencesPriorityTwoButton.getSolidColor(), 2.0));
        Button upgradePreferencesPriorityThreeButton = (Button) findViewById(R.id.upgradePreferencesPriorityThreeButton);
        scaleColors.add(new ScaleColor(upgradePreferencesPriorityThreeButton.getSolidColor(), 3.0));
        Button upgradePreferencesPriorityFourButton = (Button) findViewById(R.id.upgradePreferencesPriorityFourButton);
        scaleColors.add(new ScaleColor(upgradePreferencesPriorityFourButton.getSolidColor(), 4.0));
        Button upgradePreferencesPriorityFiveButton = (Button) findViewById(R.id.upgradePreferencesPriorityFiveButton);
        scaleColors.add(new ScaleColor(upgradePreferencesPriorityFiveButton.getSolidColor(), 5.0));

        return scaleColors;
    }

    void saveModelOnStorage() {
        //TODO: Implement this
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
