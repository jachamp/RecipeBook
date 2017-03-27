package com.jachamp.android.recipebook.ui;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jachamp.android.recipebook.R;

/**
 * A simple {@link Fragment} subclass.
 *
 * @author James Champ
 * @version 1.0, 27 March 2017
 */
public class IngredientFragment extends Fragment {


    public IngredientFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ingredient, container, false);
    }

}
