package com.jachamp.android.recipebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.jachamp.android.recipebook.ui.AddRecipeActivity;
import com.jachamp.android.recipebook.ui.SearchActivity;

/**
 *  Main activity for RecipeBook application.  Allows users to choose between adding a new
 *  recipe to the database or search for an existing recipe.
 *
 *  @author James Champ
 *  @version 1.0, 28 February 2017
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSearchActivity(View view) {
        Intent intent = new Intent(MainActivity.this, SearchActivity.class);
        startActivity(intent);
    }

    public void startAddRecipeActivity(View view) {
        Intent intent = new Intent(MainActivity.this, AddRecipeActivity.class);
        startActivity(intent);
    }
}
