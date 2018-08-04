package com.example.matic.superkuhar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.matic.superkuhar.R;
import com.example.matic.superkuhar.activities.RecipeDetailsActivity;

public class RecipeFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_recipe, container, false);

        final ConstraintLayout rootLayout = rootView.findViewById(R.id.recipe_root_layout);
        rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRecipeDetailsActivity = new Intent(rootLayout.getContext(), RecipeDetailsActivity.class);
                startActivity(goToRecipeDetailsActivity);
            }
        });

        return rootView;
    }
}