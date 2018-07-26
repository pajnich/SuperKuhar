package com.example.matic.superkuhar;

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
class IngredientView extends TextView{
    public IngredientView(Context context) {
        super(context);
    }

    public IngredientView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public IngredientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public IngredientView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    public IngredientView(Context context, String ingredientName) {
        super(context);
        setText(ingredientName);
        setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, 100));
        setTextColor(Color.parseColor("#356859"));
        setTextSize(24);
    }

    public String getIngredientName() {
        return getText().toString();
    }
}
