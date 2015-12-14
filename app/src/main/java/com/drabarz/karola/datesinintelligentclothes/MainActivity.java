package com.drabarz.karola.datesinintelligentclothes;

import com.drabarz.karola.datesinintelligentclothes.model.Model;

public final class MainActivity extends BaseActivity {

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected int getCoordinatorLayout() {
        return R.id.mainLayout;
    }
}
