package com.jachamp.android.recipebook.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jachamp.android.recipebook.R;

/**
 * Activity that allows users to enter a new note for a given recipe.
 *
 * @author James Champ
 * @version 1.0, 7 March 2017
 */
public class AddNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);
    }
}
