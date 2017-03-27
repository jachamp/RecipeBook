package com.jachamp.android.recipebook.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jachamp.android.recipebook.R;

/**
 * Displays a recipe.  Recipes contain a list of ingredients, a list of instructions, and
 * a picture of the food (if one exists).
 *
 * This Fragment is used by {@link DisplayRecipeActivity} and {@link RecipeConfirmationActivity}.
 *
 * @author James Champ
 * @version 1.0, 27 March 2017
 */
public class RecipeFragment extends Fragment {


    public RecipeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recipe, container, false);
    }

}
