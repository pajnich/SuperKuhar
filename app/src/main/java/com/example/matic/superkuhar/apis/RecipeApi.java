package com.example.matic.superkuhar.apis;

import com.example.matic.superkuhar.models.Recipe;

import java.util.ArrayList;

public class RecipeApi {

    public static ArrayList<Recipe> searchForRecipes(ArrayList<String> ingredientsNames) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        recipes.add(mockRecipe("Mascarponejeve kocke"));
        recipes.add(mockRecipe("Torta Nutella"));
        recipes.add(mockRecipe("Skutino pecivo za požrešne sosede"));
        return recipes;
    }

    private static Recipe mockRecipe(String recipeTitle) {
        Recipe recipe = new Recipe();
        recipe.setTitle(recipeTitle);
        ArrayList<String> ingredients = new ArrayList<String>();
        ArrayList<String> directions = new ArrayList<String>();
        switch (recipeTitle){
            case "Grška solata":
                ingredients.add("kumarice");
                ingredients.add("paradižnik");
                ingredients.add("paprika");
                ingredients.add("olive");
                ingredients.add("feta sir");
                ingredients.add("olivno olje");
                ingredients.add("jabolčni kis");
                ingredients.add("origano");
                ingredients.add("sol");
                ingredients.add("poper");
                directions.add("Vso zelenjavo narežemo na približno 0,5 cm velike kocke.");
                directions.add("Vse skupaj damo v eno posodo, zmešamo, okisamo solimo, popramo in na koncu dodamo še feta sir.");
                directions.add("Pustimo nekaj časa v hladilniku, da je bolj sveže.");
                break;
            case "Čokoladna torta (presna, veganska)":
                ingredients.add("OSNOVA");
                ingredients.add("1 skodelica lešnikov");
                ingredients.add("1 skodelica mandljev");
                ingredients.add("1 1/2 skodelice datljev");
                ingredients.add("1/2 skodelice presnega kakava");
                ingredients.add("2 žlici kokosovega masla");
                ingredients.add("2 žlici vode");
                ingredients.add("1/2 čajne žličke vanilije v prahu (neobvezno)");
                ingredients.add("");
                ingredients.add("NADEV");
                ingredients.add("250 g malin ali banan");
                ingredients.add("");
                ingredients.add("ČOKOLADNA MASA");
                ingredients.add("2 skodelici datljev");
                ingredients.add("1 1/2 skodelice vode");
                ingredients.add("1/2 skodelice presnega kakava");
                ingredients.add("1/2 skodelice kokosovega masla");
                directions.add("Najprej v multipraktiku zmešamo lešnike in mandlje, potem postopoma dodajamo še datlje. Ko je vse lepo sesekljano, dodamo še ostale sestavine.");
                directions.add("V tortni pekač položimo plastično folijo za živila (da bomo tortico kasneje lažje vzeli ven). Osnovo čim bolj potlačimo v tortni pekač. ");
                directions.add("Maline ali banane (ali pa kakšno drugo sadje) zložimo po osnovi.");
                directions.add("Za čokoladno kremo datlje meljemo, dokler ne nastane sprijeta krogla oz. da so sesekljani na res majhne koščke. Potem dodamo vodo in meljemo kar nekaj časa, dokler ne nastane gosta zmes (datljeva pasta). Vse mora biti lepo zmleto, brez delčkov. Dodamo še kakav in kokosovo maslo in zmeljemo še to. To čokoladno maso prelijemo po tortici, damo v hladilnik in počakamo, da se strdi (cca. 30 minut).");
                break;
            case "Čufti v paradižnikovi omaki":
                ingredients.add("ČUFTI");
                ingredients.add("2 žlici olivnega olja");
                ingredients.add("60 g čebule");
                ingredients.add("2 stroka česna");
                ingredients.add("60 g riža");
                ingredients.add("1 dl juhe");
                ingredients.add("200 g mlete govedine");
                ingredients.add("200 g mlete svinjine");
                ingredients.add("sol");
                ingredients.add("poper");
                ingredients.add("majaron");
                ingredients.add("peteršilj");
                ingredients.add("");
                ingredients.add("PARADIŽNIKOVA OMAKA");
                ingredients.add("120 g paradižnikove mezge");
                ingredients.add("1 žlica olivnega olja");
                ingredients.add("1 žlica sladkorja");
                ingredients.add("1 žlica moke");
                ingredients.add("sol");
                ingredients.add("rožmarin");
                ingredients.add("muškatni orešček");
                directions.add("ČUFTI\nNa olivnem olju prepražimo sesekljano čebulo. Ko čebula ovene, dodamo strt česen in nato riž. Prilijemo juho, premešamo in naj se preduši toliko, da bo riž na pol kuhan.");
                directions.add("Ohlajenemu rižu z rokami primešamo mleto meso in oblikujemo v kroglice. Če je masa premokra, si pomagamo z drobtinami.");
                directions.add("Čufte zlato rumeno opečemo na malo maščobe. V paradižnikovi omaki jih podušimo še 15 minut.");
                directions.add("OMAKA\nNa maščobi zarumenimo sladkor, dodamo moko, vse skupaj prepražimo. Primešamo paradižnikovo mezgo in zalijemo z juho. Začinimo in še malo pokuhamo.");
                break;
        }
        return recipe;
    }
}
