package com.jachamp.android.recipebook.ui;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Spinner;

import com.jachamp.android.recipebook.R;

/**
 * Activity that allows users to add a new recipe to the RecipeBook database.
 *
 * @author James Champ
 * @version 1.0, 7 March 2017
 */
public class AddRecipeActivity extends AppCompatActivity
        implements InstructionFragment.OnFragmentInteractionListener{

    EditText mNameEditText;
    Spinner mTypeSpinner;
    EditText mPrepTimeEditText;
    EditText mCookTimeEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
