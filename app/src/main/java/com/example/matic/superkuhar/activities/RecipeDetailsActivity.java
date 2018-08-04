package com.example.matic.superkuhar.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.matic.superkuhar.R;

public class RecipeDetailsActivity extends Activity {

    private Button cook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);
        getViewReferences();
        setOnClickListeners();
    }

    private void getViewReferences() {
        cook = findViewById(R.id.recipe_details_cook);
    }

    private void setOnClickListeners() {
        cook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToCookActivity = new Intent(RecipeDetailsActivity.this, CookActivity.class);
                startActivity(goToCookActivity);
            }
        });
    }
}
