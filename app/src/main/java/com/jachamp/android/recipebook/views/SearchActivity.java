package com.jachamp.android.recipebook.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.jachamp.android.recipebook.R;

/**
 *
 */
public class SearchActivity extends AppCompatActivity {

    private Spinner mSearchTypeSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        mSearchTypeSpinner = (Spinner) findViewById(R.id.search_spinner);
        ArrayAdapter<CharSequence> typeAdaptor = ArrayAdapter.createFromResource(
                this,
                R.array.spinner_options,
                android.R.layout.simple_spinner_item);

        typeAdaptor.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        mSearchTypeSpinner.setAdapter(typeAdaptor);
    }
}
