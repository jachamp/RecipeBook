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

    private static final String SQL_CREATE_RECIPES =
            "CREATE TABLE " + RecipeBookContract.RecipeEntry.TABLE_NAME + " (" +
                    RecipeBookContract.RecipeEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    RecipeBookContract.RecipeEntry.COLUMN_INGREDIENT_LIST + " INTEGER," +
                    RecipeBookContract.RecipeEntry.COLUMN_INSTRUCTION_LIST + " INTEGER," +
                    RecipeBookContract.RecipeEntry.COLUMN_NOTE_LIST + " INTEGER," +
                    RecipeBookContract.RecipeEntry.COLUMN_PICTURE + " BLOB," +
                    RecipeBookContract.RecipeEntry.COLUMN_PREP_TIME + " INTEGER NOT NULL," +
                    RecipeBookContract.RecipeEntry.COLUMN_COOK_TIME + " INTEGER NOT NULL," +
                    RecipeBookContract.RecipeEntry.COLUMN_DATE_ADDED + " TEXT NOT NULL," +
                    RecipeBookContract.RecipeEntry.COLUMN_RECIPE_NAME + " TEXT NOT NULL," +
                    RecipeBookContract.RecipeEntry.COLUMN_TYPE + " INTEGER NOT NULL," +
                    RecipeBookContract.RecipeEntry.COLUMN_TAG_LIST + " INTEGER NOT NULL)";

    private static final String SQL_CREATE_TAGS =
            "CREATE TABLE " + RecipeBookContract.TagListEntry.TABLE_NAME + " (" +
                    RecipeBookContract.TagListEntry._ID + " INTEGER NOT NULL," +
                    RecipeBookContract.TagListEntry.COLUMN_TAG + " TEXT NOT NULL," +
                    "FOREIGN KEY(" + RecipeBookContract.TagListEntry._ID + ") " +
                    "REFERENCES " + RecipeBookContract.RecipeEntry.TABLE_NAME + "(" +
                    RecipeBookContract.RecipeEntry.COLUMN_TAG_LIST + ")," +
                    "PRIMARY KEY (" + RecipeBookContract.TagListEntry._ID + ", " +
                    RecipeBookContract.TagListEntry.COLUMN_TAG + "))";

    private static final String SQL_CREATE_INGREDIENTS =
            "CREATE TABLE " + RecipeBookContract.IngredientListEntry.TABLE_NAME + " (" +
                    RecipeBookContract.IngredientListEntry._ID + " INTEGER NOT NULL," +
                    RecipeBookContract.IngredientListEntry.COLUMN_ORDER + " INTEGER NOT NULL," +
                    RecipeBookContract.IngredientListEntry.COLUMN_INGREDIENT + " TEXT NOT NULL," +
                    RecipeBookContract.IngredientListEntry.COLUMN_DESCRIPTION + " TEXT NOT NULL," +
                    RecipeBookContract.IngredientListEntry.COLUMN_AMOUNT + " TEXT NOT NULL," +
                    "FOREIGN KEY(" + RecipeBookContract.IngredientListEntry._ID + ") " +
                    "REFERENCES " + RecipeBookContract.RecipeEntry.TABLE_NAME + "(" +
                    RecipeBookContract.RecipeEntry.COLUMN_INGREDIENT_LIST + ")," +
                    "PRIMARY KEY(" + RecipeBookContract.IngredientListEntry._ID + ", " +
                    RecipeBookContract.IngredientListEntry.COLUMN_ORDER + "))";

    private static final String SQL_CREATE_NOTES =
            "CREATE TABLE " + RecipeBookContract.NoteListEntry.TABLE_NAME + " (" +
                    RecipeBookContract.NoteListEntry._ID + " INTEGER NOT NULL," +
                    RecipeBookContract.NoteListEntry.COLUMN_NOTE + " TEXT NOT NULL," +
                    RecipeBookContract.NoteListEntry.COLUMN_PICTURE + " BLOB," +
                    RecipeBookContract.NoteListEntry.COLUMN_PREP_TIME + " INTEGER NOT NULL," +
                    RecipeBookContract.NoteListEntry.COLUMN_COOK_TIME + " INTEGER NOT NULL," +
                    RecipeBookContract.NoteListEntry.COLUMN_DATE + " TEXT NOT NULL," +
                    "FOREIGN KEY(" + RecipeBookContract.NoteListEntry._ID + ") " +
                    "REFERENCES " + RecipeBookContract.RecipeEntry.TABLE_NAME + "(" +
                    RecipeBookContract.RecipeEntry.COLUMN_NOTE_LIST + ")," +
                    "PRIMARY KEY(" + RecipeBookContract.NoteListEntry._ID + ", " +
                    RecipeBookContract.NoteListEntry.COLUMN_DATE + "))";

    private static final String SQL_CREATE_INSTRUCTIONS =
            "CREATE TABLE " + RecipeBookContract.InstructionListEntry.TABLE_NAME + " (" +
                    RecipeBookContract.InstructionListEntry._ID + " INTEGER NOT NULL," +
                    RecipeBookContract.InstructionListEntry.COLUMN_ORDER + " INTEGER NOT NULL," +
                    RecipeBookContract.InstructionListEntry.COLUMN_INSTRUCTION + " TEXT NOT NULL," +
                    "FOREIGN KEY(" + RecipeBookContract.InstructionListEntry._ID + ") " +
                    "REFERENCES " + RecipeBookContract.RecipeEntry.TABLE_NAME + "(" +
                    RecipeBookContract.RecipeEntry.COLUMN_INSTRUCTION_LIST + ")," +
                    "PRIMARY KEY(" + RecipeBookContract.InstructionListEntry._ID + ", " +
                    RecipeBookContract.InstructionListEntry.COLUMN_ORDER + "))";


    public RecipeBookDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    /**
     * Creates one of each table in the database.
     *
     * @param db    The SQLite database
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_RECIPES);
        db.execSQL(SQL_CREATE_INGREDIENTS);
        db.execSQL(SQL_CREATE_INSTRUCTIONS);
        db.execSQL(SQL_CREATE_NOTES);
        db.execSQL(SQL_CREATE_TAGS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
