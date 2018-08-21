package com.example.matic.superkuhar.views;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class IngredientsList extends LinearLayout{


    public IngredientsList(Context context) {
        super(context);
    }

    public IngredientsList(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public IngredientsList(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public IngredientsList(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public ArrayList<String> getIngredientsNames() {
        ArrayList<String> ingredientsNames = new ArrayList<>();
        for (int i = 0; i < getChildCount(); i++) {
            IngredientView ingredientView = (IngredientView) getChildAt(i);
            ingredientsNames.add(ingredientView.getIngredientName());
        }
        return ingredientsNames;
    }

    public void fillWithIngredients(ArrayList<String> ingredients, int fontSize) {
        for (String ingredient :
                ingredients) {
            IngredientView ingredientView = new IngredientView(getContext(), ingredient, fontSize);
            addIngredient(ingredientView);
        }
    }

    public void addIngredient(IngredientView ingredient) {
        addView(ingredient, 0);
    }
}
