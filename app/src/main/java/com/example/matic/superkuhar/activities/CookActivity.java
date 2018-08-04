package com.example.matic.superkuhar.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.example.matic.superkuhar.R;
import com.example.matic.superkuhar.fragments.DirectionsFragment;
import com.example.matic.superkuhar.fragments.IngredientsFragment;

public class CookActivity extends AppCompatActivity {

    private String recipeJSON;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cook);
        getRecipeFromIntent();
        setupViewPager();
    }

    private void getRecipeFromIntent() {
        Intent intent = getIntent();
        recipeJSON = intent.getStringExtra("recipe");
    }

    private void setupViewPager() {
        ViewPager vpPager = findViewById(R.id.cook_viewpager);
        CookRecipePagerAdapter adapterViewPager = new CookRecipePagerAdapter(getSupportFragmentManager());
        vpPager.setAdapter(adapterViewPager);
    }

    public class CookRecipePagerAdapter extends FragmentPagerAdapter {
        CookRecipePagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public int getCount() {
            return 2;
        }

        @Override
        public Fragment getItem(int position) {
            Bundle bundle = new Bundle();
            bundle.putString("recipeJSON", recipeJSON);
            switch (position) {
                case 0:
                    IngredientsFragment ingredientsFragment = new IngredientsFragment();
                    ingredientsFragment.setArguments(bundle);
                    return ingredientsFragment;
                case 1:
                    DirectionsFragment directionsFragment = new DirectionsFragment();
                    directionsFragment.setArguments(bundle);
                    return directionsFragment;
                default:
                    return null;
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0:
                    return getResources().getString(R.string.INGREDIENTS);
                case 1:
                    return getResources().getString(R.string.DIRECTIONS);
                default:
                    return "";
            }
        }

    }
}
