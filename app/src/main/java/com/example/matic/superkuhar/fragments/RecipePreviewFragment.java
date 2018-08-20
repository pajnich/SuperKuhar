package com.example.matic.superkuhar.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.matic.superkuhar.R;
import com.example.matic.superkuhar.activities.RecipeDetailsActivity;

public class RecipePreviewFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_recipe_preview, container, false);

        final ConstraintLayout rootLayout = rootView.findViewById(R.id.recipe_root_layout);
        rootLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToRecipeDetailsActivity = new Intent(rootLayout.getContext(), RecipeDetailsActivity.class);
                startActivity(goToRecipeDetailsActivity);
            }
        });

        Bundle args = getArguments();
        int index = args.getInt("index", 0);
        setRecipePreviewContent(rootView, index);

        return rootView;
    }

    private void setRecipePreviewContent(ViewGroup rootLayout, int index) {
        ImageView recipeImageHolder = rootLayout.findViewById(R.id.recipe_image);
        TextView recipeTitleHolder = rootLayout.findViewById(R.id.recipe_title);
        switch (index){
            case 0:
                recipeImageHolder.setImageDrawable(getResources().getDrawable(R.drawable.dish_skutne_rezine));
                recipeTitleHolder.setText("Skutne rezine z jabolki");
                break;
            case 1:
                recipeImageHolder.setImageDrawable(getResources().getDrawable(R.drawable.dish_rizev_narastek));
                recipeTitleHolder.setText("Rižev narastek s pudingom");
                break;
            case 2:
                recipeImageHolder.setImageDrawable(getResources().getDrawable(R.drawable.dish_mandljev_kruh));
                recipeTitleHolder.setText("Mandljev kruh z borovnicami");
                break;
            default:
                recipeImageHolder.setImageDrawable(getResources().getDrawable(R.drawable.dish_skutne_rezine));
                recipeTitleHolder.setText("Skutne rezine z jabolki");
                break;
        }
    }
}