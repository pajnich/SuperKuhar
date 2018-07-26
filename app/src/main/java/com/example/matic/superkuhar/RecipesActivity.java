package com.example.matic.superkuhar;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;

public class RecipesActivity extends FragmentActivity {

    private int numberOfRecipesFound;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        processIntent();
        setupViewPager();
    }

    private void processIntent() {
        Intent intentFromMainActivity = getIntent();
        numberOfRecipesFound = intentFromMainActivity.getIntExtra("numberOfRecipesFound", 0);
    }

    private void setupViewPager() {
        ViewPager recipePager = findViewById(R.id.viewpager_recipe);
        ScreenSlidePagerAdapter recipePagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        recipePager.setAdapter(recipePagerAdapter);
    }

    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new RecipeFragment();
        }

        @Override
        public int getCount() {
            return numberOfRecipesFound;
        }
    }

}
