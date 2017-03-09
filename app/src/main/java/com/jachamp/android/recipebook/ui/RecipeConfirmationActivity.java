package com.jachamp.android.recipebook.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jachamp.android.recipebook.R;

/**
 * Activity that displays a recipe that the user inputted and allows user to make changes, store
 * recipe in RecipeBook's database, or delete the recipe.
 *
 * @author James Champ
 * @version 1.0, 7 March 2017
 */
public class RecipeConfirmationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_confirmation);
    }
}
