package com.jachamp.android.recipebook.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jachamp.android.recipebook.R;

/**
 * Activity that displays a chosen recipe to the user.
 *
 * @author James Champ
 * @version 1.0, 7 March 2017
 */
public class DisplayRecipeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_recipe);
    }
}
