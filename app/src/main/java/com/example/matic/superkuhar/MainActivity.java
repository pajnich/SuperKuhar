package com.example.matic.superkuhar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    private static final String[] COUNTRIES = new String[]{
            "Belgium", "France", "Italy", "Germany", "Spain"
    };
    private AutoCompleteTextView ingredientsSearch;
    private IngredientsList ingredientsList;
    private ImageView arrowGoToRecipes;

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
                IngredientView ingredient = new IngredientView(MainActivity.this, ingredientName);
                ingredientsList.addIngredient(ingredient);
                if (RecipeApi.searchForRecipes(ingredientsList.getIngredientsNames()) > 0) {
                    arrowGoToRecipes.setVisibility(View.VISIBLE);
                }
                ingredientsSearch.setText("");
            }
        });
        arrowGoToRecipes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentGoToRecipes = new Intent(MainActivity.this, RecipesActivity.class);
                startActivity(intentGoToRecipes);
            }
        });
    }
}
