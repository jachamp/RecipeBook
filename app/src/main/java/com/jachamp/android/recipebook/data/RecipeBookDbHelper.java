package com.jachamp.android.recipebook.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *
 * @author James Champ
 * @verson 1.0, 29 March 2017
 */

public class RecipeBookDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "recipeBook.db";

    private static final int DATABASE_VERSION = 1;

    public RecipeBookDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
