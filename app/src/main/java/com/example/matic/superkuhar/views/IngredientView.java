package com.example.matic.superkuhar.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;

@SuppressLint("AppCompatCustomView")
public class IngredientView extends TextView {

    public IngredientView(Context context, String ingredientName, int fontSize) {
        super(context);
        setText(ingredientName);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        setTextColor(Color.parseColor("#356859"));
        setTextSize(fontSize);
    }

    public String getIngredientName() {
        return getText().toString();
    }
}
