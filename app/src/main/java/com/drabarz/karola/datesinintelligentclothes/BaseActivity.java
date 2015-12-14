package com.drabarz.karola.datesinintelligentclothes;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.drabarz.karola.datesinintelligentclothes.model.Model;

public abstract class BaseActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Model model = new Model();

    protected abstract int getLayout();
    protected abstract int getCoordinatorLayout();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawerLayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.todayDatesItem) {
            onMenuItemClicked(R.string.today_dates);
            startActivity(new Intent(this, TodayDateActivity.class));
            return true;
        }
        if (item.getItemId() == R.id.findDateItem) {
            onMenuItemClicked(R.string.find_date);
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }
        if (item.getItemId() == R.id.updateLookItem) {
            onMenuItemClicked(R.string.update_look);
            startActivity(new Intent(this, UpgradeLookActivity.class));
            return true;
        }
        if (item.getItemId() == R.id.updatePreferencesItem) {
            onMenuItemClicked(R.string.update_preferences);
            startActivity(new Intent(this, UpdragePreferencesActivity.class));
            return true;
        }
        if (item.getItemId() == R.id.profileInformationItem) {
            onMenuItemClicked(R.string.profile_information);
            startActivity(new Intent(this, ProfileActivity.class));
            return true;
        }
        return false;
    }

    void onMenuItemClicked(int message) {
        DrawerLayout drawer = (DrawerLayout) this.findViewById(R.id.drawerLayout);
        Snackbar.make(findViewById(getCoordinatorLayout()), message, Snackbar.LENGTH_LONG).show();
        drawer.closeDrawers();
    }
}
