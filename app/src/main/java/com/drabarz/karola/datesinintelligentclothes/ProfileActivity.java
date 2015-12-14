package com.drabarz.karola.datesinintelligentclothes;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.drabarz.karola.datesinintelligentclothes.model.Location;
import com.drabarz.karola.datesinintelligentclothes.model.UserProfile;


public class ProfileActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_profile;
    }

    @Override
    protected int getCoordinatorLayout() {
        return R.id.profileLayout;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fulfillEditTextWithUserData();

        Button profileSaveChangesButton = (Button) findViewById(R.id.profileSaveChangesButton);
        profileSaveChangesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                profileSaveChangesButtonAction();
            }
        });
    }

    void fulfillEditTextWithUserData() {
        UserProfile userProfile = model.getUserProfile();
        Location location = userProfile.getLocation();

        EditText profileNicknameEditText = (EditText) findViewById(R.id.profileNickanmeEditText);
        profileNicknameEditText.setText(userProfile.getNickname());

        EditText profileAgeEditText = (EditText) findViewById(R.id.profileAgeEditText);
        profileAgeEditText.setText(userProfile.getAge().toString());

        EditText profileLocationLongitude = (EditText) findViewById(R.id.profileLocationLongitudeEditText);
        profileLocationLongitude.setText(location.getLongitude());

        EditText profileLocationLattitude = (EditText) findViewById(R.id.profileLocationLattitudeEditText);
        profileLocationLattitude.setText(location.getLattitude());

        EditText profileSizeEditText = (EditText) findViewById(R.id.profileSizeEditText);
        profileSizeEditText.setText(userProfile.getSize());
    }

    void profileSaveChangesButtonAction() {
        saveNewUserProfileToModel();
        saveModelOnStorage();
        Snackbar.make(findViewById(R.id.profileLayout), R.string.changes_saved, Snackbar.LENGTH_LONG).show();
    }

    //TODO - data not saved- always on create?
    void saveNewUserProfileToModel() {
        UserProfile userProfile = model.getUserProfile();
        Location location;

        EditText profileNicknameEditText = (EditText) findViewById(R.id.profileNickanmeEditText);
        userProfile.setNickname(profileNicknameEditText.getText().toString());

        EditText profileAgeEditText = (EditText) findViewById(R.id.profileAgeEditText);
        userProfile.setAge(Integer.parseInt(profileAgeEditText.getText().toString()));

        EditText profileLocationLongitude = (EditText) findViewById(R.id.profileLocationLongitudeEditText);
        EditText profileLocationLattitude = (EditText) findViewById(R.id.profileLocationLattitudeEditText);
        location = new Location(profileLocationLongitude.getText().toString(), profileLocationLattitude.getText().toString());
        userProfile.setLocation(location);

        EditText profileSizeEditText = (EditText) findViewById(R.id.profileSizeEditText);
        userProfile.setSize(profileSizeEditText.getText().toString());

        model.setUserProfile(userProfile);
    }

    void saveModelOnStorage(){
        //TODO: Implement this
    }

    protected void OnRestart(Bundle savedInstanceState)
    {
        fulfillEditTextWithUserData();
    }

    protected void OnResume(Bundle savedInstanceState)
    {
        fulfillEditTextWithUserData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_profile, menu);
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
