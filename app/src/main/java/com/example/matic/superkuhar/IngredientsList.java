package com.example.matic.superkuhar;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

class IngredientsList extends LinearLayout{


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

    public void addIngredient(IngredientView ingredient) {
        addView(ingredient, 0);
    }
}
