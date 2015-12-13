package com.drabarz.karola.datesinintelligentclothes;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.support.design.widget.Snackbar;
import android.view.View;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        findViewById(R.id.findLoverButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(findViewById(R.id.mainLayout), R.string.find_lover_information, Snackbar.LENGTH_LONG).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        DrawerLayout drawer = (DrawerLayout) this.findViewById(R.id.drawerLayout);

        if(item.getItemId() == R.id.todayDatesItem){
            Snackbar.make(findViewById(R.id.mainLayout), R.string.today_dates, Snackbar.LENGTH_LONG).show();
            drawer.closeDrawers();
            return true;
        }
        if(item.getItemId() == R.id.findDateItem){
            Snackbar.make(findViewById(R.id.mainLayout), R.string.find_date, Snackbar.LENGTH_LONG).show();
            drawer.closeDrawers();
            return true;
        }
        if(item.getItemId() == R.id.updateLookItem){
            Snackbar.make(findViewById(R.id.mainLayout), R.string.update_look, Snackbar.LENGTH_LONG).show();
            drawer.closeDrawers();
            return true;
        }
        if(item.getItemId() == R.id.updatePreferencesItem){
            Snackbar.make(findViewById(R.id.mainLayout), R.string.update_preferences, Snackbar.LENGTH_LONG).show();
            drawer.closeDrawers();
            return true;
        }
        if(item.getItemId() == R.id.profileInformationItem){
            Snackbar.make(findViewById(R.id.mainLayout), R.string.profile_information, Snackbar.LENGTH_LONG).show();
            drawer.closeDrawers();
            return true;
        }

        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
