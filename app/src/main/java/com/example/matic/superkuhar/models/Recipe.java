package com.example.matic.superkuhar.models;

import java.util.ArrayList;

public class Recipe {
    String title;
    ArrayList<String> ingredients;
    ArrayList<String> directions;

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
