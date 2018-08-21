package com.example.matic.superkuhar.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matic.superkuhar.R;
import com.example.matic.superkuhar.apis.RecipeApi;
import com.example.matic.superkuhar.models.Recipe;
import com.example.matic.superkuhar.views.IngredientView;
import com.example.matic.superkuhar.views.IngredientsList;
import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private static final String[] COUNTRIES = new String[]{
            "Mleko", "Sir", "Vanilijin sladkor", "Jajca", "Moka", "Jabolka"
    };
    private AutoCompleteTextView ingredientsSearch;
    private IngredientsList ingredientsList;
    private ImageView arrowGoToRecipes;
    private ArrayList<Recipe> recipes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getViewReferences();
        setViewAdapters();
        setViewListeners();
    }

    private void getViewReferences() {
        ingredientsSearch = findViewById(R.id.main_ingredients_search);
        ingredientsList = findViewById(R.id.main_ingredients_list);
        arrowGoToRecipes = findViewById(R.id.main_arrow_go_to_recipes);
    }

    private void setViewAdapters() {
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this, android.R.layout.select_dialog_item, COUNTRIES);
        ingredientsSearch.setThreshold(2);
        ingredientsSearch.setAdapter(adapter);
    }

    private void setViewListeners() {
        ingredientsSearch.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView textView = (TextView) view;
                String ingredientName = textView.getText().toString();
                IngredientView ingredient = new IngredientView(MainActivity.this, ingredientName, 24);
                ingredientsList.addIngredient(ingredient);
                if ((recipes = RecipeApi.searchForRecipes(ingredientsList.getIngredientsNames())) != null) {
                    arrowGoToRecipes.setVisibility(View.VISIBLE);
                }
                ingredientsSearch.setText("");
            }
        });
        arrowGoToRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToRecipes = new Intent(MainActivity.this, RecipesActivity.class);
                intentGoToRecipes.putExtra("numberOfRecipesFound", 3);
                startActivity(intentGoToRecipes);
            }
        });
    }
}
