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

import java.util.ArrayList;
import java.util.Collections;

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
            ingredientsList.fillWithIngredients(recipe.getIngredients(), 16);
        }

        //TEST
        ArrayList<String> mockIngredients = new ArrayList<>();
        mockIngredients.add("500g pasirane skute (kremni sirček ali sirni namaz)");
        mockIngredients.add("2 jajci");
        mockIngredients.add("120g sladkorja v prahu");
        mockIngredients.add("1 vrečka vanilijevega sladkorja");
        mockIngredients.add("1 limona");
        mockIngredients.add("4 manjša rdeča jabolka");
        mockIngredients.add("");
        mockIngredients.add("TESTO");
        mockIngredients.add("240g gladke moke");
        mockIngredients.add("1 ščepec soli");
        mockIngredients.add("80g sladkorja v prahu");
        mockIngredients.add("1 žlička pecilnega praška");
        mockIngredients.add("1 vrečka vanilijevega sladkorja");
        mockIngredients.add("160g hladnega, na kocke narezanega masla");
        mockIngredients.add("1 jajce");
        Collections.reverse(mockIngredients);
        ingredientsList.fillWithIngredients(mockIngredients, 16);
    }

    private Recipe getRecipeFromIntent() {
        String recipeJSON = getArguments().getString("recipeJSON");
        return new Gson().fromJson(recipeJSON, Recipe.class);
    }
}
