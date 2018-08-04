package com.example.matic.superkuhar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.matic.superkuhar.R;
import com.example.matic.superkuhar.models.Recipe;
import com.example.matic.superkuhar.views.IngredientsList;
import com.google.gson.Gson;

public class IngredientsFragment extends Fragment {

    private ViewGroup rootView;
    private IngredientsList ingredientsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_ingredients, container, false);
        getViewReferences();
        fillIngredientsList();
        return rootView;
    }

    private void getViewReferences() {
        ingredientsList = rootView.findViewById(R.id.main_ingredients_list);
    }

    private void fillIngredientsList() {
        Recipe recipe = getRecipeFromIntent();
        if(recipe != null){
            ingredientsList.fillWithIngredients(recipe.getIngredients());
        }
    }

    private Recipe getRecipeFromIntent() {
        String recipeJSON = getArguments().getString("recipeJSON");
        return new Gson().fromJson(recipeJSON, Recipe.class);
    }
}
