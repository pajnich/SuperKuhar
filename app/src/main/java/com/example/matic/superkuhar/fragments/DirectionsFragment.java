package com.example.matic.superkuhar.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.matic.superkuhar.R;
import com.example.matic.superkuhar.views.IngredientsList;

import java.util.ArrayList;
import java.util.Collections;

public class DirectionsFragment extends Fragment {

    private ViewGroup rootView;
    private IngredientsList ingredientsList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_directions, container, false);
        getViewReferences();
        fillIngredientsList();
        return rootView;
    }

    private void getViewReferences() {
        ingredientsList = rootView.findViewById(R.id.directions_ingredients_list);
    }

    private void fillIngredientsList() {
        //TEST
        ArrayList<String> mockIngredients = new ArrayList<>();
        mockIngredients.add("1. V skledo presejemo moko, sladkor v prahu, sol in pecilni prašek. Presejane sestavine zmešamo z vanilijevim sladkorjem, potem pa po njih potrosimo na kocke narezano maslo. Maščobo s konicami prstov vgnetemo v suhe sestavine ter mešanico pri tem dvigamo, da postane zračna in podobna drobtinam. Dodamo jajce in vse skupaj s hladnimi rokami zgnetemo v testo, ki ga oblikujemo v kepo, sploščimo v disk, zavijemo v folijo za živila in za 30 minut shranimo v hladilnik.");
        mockIngredients.add("");
        mockIngredients.add("2. Medtem ko testo počiva, pripravimo ostale sestavine. Pečico segrejemo na 180 stopinj Celzija. Dno srednje velikega pravokotnega pekača za peciva (velikosti približno 25 x 35 cm) rahlo namastimo z maslom in obložimo s papirjem za peko. V skledi gladko razmešamo skuto (kremni sir), jajca, sladkor in sok polovice limone. Jabolka operemo in osušimo s papirnatimi brisačkami. Z okroglim izrezovalnikom jim izrežemo sredico, potem pa jih narežemo na 2 cm debele kolobarje, ki jih takoj pokapamo z limoninim sokom, da ne potemnijo.");
        mockIngredients.add("");
        mockIngredients.add("3. Testo vzamemo iz hladilnika in ga na rahlo pomokani delovni površini razvaljamo 1 cm  debelo. Položimo ga v pekač in pazimo, da z njim v celoti prekrijemo dno. Na testo enakomerno debelo namažemo skutni nadev in po njem razporedimo jabolčne kolobarje. Pecivo pečemo v ogreti pečici približno 45 minut. Pred serviranjem ga dobro ohladimo in narežemo na manjše kose.");
        Collections.reverse(mockIngredients);
        ingredientsList.fillWithIngredients(mockIngredients, 16);
    }
}
