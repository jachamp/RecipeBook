package com.jachamp.android.recipebook.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jachamp.android.recipebook.R;

/**
 * Activity that allows users to search for recipes of a given type.
 *
 * @author James Champ
 * @version 1.0, 9 March 2017
 */
public class TypeSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type_search);
    }
}
