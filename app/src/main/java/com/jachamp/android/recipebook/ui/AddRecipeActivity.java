package com.jachamp.android.recipebook.ui;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

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
    EditText mIngredientEditText;
    EditText mDescriptionEditText;
    EditText mAmountEditText;
    EditText mInstructionEditText;

    Button mAddIngredientButton;
    Button mAddInstructionButton;
    Button mAddRecipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_recipe);

        mNameEditText = (EditText) findViewById(R.id.nameEditText);
        mTypeSpinner = (Spinner) findViewById(R.id.typeSpinner);
        mPrepTimeEditText = (EditText) findViewById(R.id.prepTimeEditText);
        mCookTimeEditText = (EditText) findViewById(R.id.cookTimeEditText);
        mIngredientEditText = (EditText) findViewById(R.id.ingredientEditText);
        mDescriptionEditText = (EditText) findViewById(R.id.descriptionEditText);
        mAmountEditText = (EditText) findViewById(R.id.amountEditText);
        mInstructionEditText = (EditText) findViewById(R.id.instructionEditText);

        mAddIngredientButton = (Button) findViewById(R.id.addIngredientButton);
        mAddIngredientButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mAddInstructionButton = (Button) findViewById(R.id.addInstructionButton);
        mAddInstructionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mAddRecipeButton = (Button) findViewById(R.id.addRecipeButton);
        mAddRecipeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String name = mNameEditText.getText().toString();
                int type = 0;   // TODO: placeholder
                String prepTimeString = mPrepTimeEditText.getText().toString();
                String cookTimeString = mCookTimeEditText.getText().toString();

                String errorMessage = "Invalid Entries: ";

                // TODO: Check that spinner has a valid type.
                // TODO: Check for ingredients and instructions.
                boolean isRecipeValid = isValidTextEntry(name) &&
                        isValidTextEntry(prepTimeString) &&
                        isValidTextEntry(cookTimeString);

                if(!isRecipeValid) {
                    errorMessage += "One or more of the fields contain nothing. ";
                }

                int cookTime;
                int prepTime;

                try {
                    cookTime = Integer.parseInt(cookTimeString);
                    prepTime = Integer.parseInt(prepTimeString);
                }
                catch(NumberFormatException e) {
                    // TODO: Log error.
                    isRecipeValid = false;
                }

                if(!isRecipeValid) {
                    errorMessage += "Prep and cook time fields must contain a whole number.";
                    Toast.makeText(AddRecipeActivity.this, errorMessage, Toast.LENGTH_SHORT).show();
                }
                else {
                    // Start RecipeConfirmationActivity
                }
            }
        });
    }

    /**
     * Validates an EditText entry by removing all whitespace characters and checking if the
     * resulting String has a length that is greater than 0.
     *
     * @param entry A String that will be validated.
     * @return  {@code true} if the String has characters other than whitespace, otherwise
     *          {@code false}.
     */
    private boolean isValidTextEntry(String entry) {
        String strippedEntry = entry.replaceAll("\\s+", "");

        return strippedEntry.length() > 0;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
