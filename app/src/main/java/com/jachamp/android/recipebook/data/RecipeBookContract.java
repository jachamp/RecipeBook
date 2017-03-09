package com.jachamp.android.recipebook.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Defines the tables and column names for the recipe book database.
 *
 * @author James Champ
 * @version 1.0, 28 February 2017
 */

public class RecipeBookContract {
    /**
     * Name of the content provider.
     */
    public static final String CONTENT_AUTHORITY = "com.jachamp.android.recipebook";

    /**
     * Base of all URI's that apps will use to contact RecipeBook's content provider.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /**
     * Possible paths that can be appended to BASE_CONTENT_URI to form valid URI's.
     */
    public static final String PATH_RECIPE_BOOK = "recipe_book";
    public static final String PATH_RECIPE = "recipe";
    public static final String PATH_TAG_LIST = "tag_list";
    public static final String PATH_INGREDIENT_LIST = "ingredient_list";
    public static final String PATH_NOTE_LIST = "note_list";
    public static final String PATH_INSTRUCTION_LIST = "instruction_list";

    //TODO: Add comments to inner classes

    /**
     *
     */
    public static final class RecipeBookEntry implements BaseColumns {
        public static final String TABLE_NAME = "recipe_book";

        public static final String COLUMN_RECIPE = "recipe";
        public static final String COLUMN_DATE_ADDED = "date";
    }

    /**
     *
     */
    public static final class RecipeEntry implements BaseColumns {
        public static final String TABLE_NAME = "recipe";

        public static final String COLUMN_INGREDIENT_LIST = "ingredient_list";
        public static final String COLUMN_INSTRUCTION_LIST = "instruction_list";
        public static final String COLUMN_PICTURE = "picture";
        public static final String COLUMN_NOTE_LIST = "note_list";
        public static final String COLUMN_PREP_TIME = "prep_time";
        public static final String COLUMN_COOK_TIME = "cook_time";
        public static final String COLUMN_LAST_MADE = "last_made";
        public static final String COLUMN_RECIPE_NAME = "recipe_name";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_TAG_LIST = "tag_list";
        public static final String COLUMN_SERVINGS = "servings";
    }

    /**
     *
     */
    public static final class TagListEntry implements BaseColumns {
        public static final String TABLE_NAME = "tag_list";

        public static final String COLUMN_TAG = "tag";
    }

    /**
     *
     */
    public static final class IngredientListEntry implements BaseColumns {
        public static final String TABLE_NAME = "ingredient_list";

        public static final String COLUMN_INGREDIENT = "ingredient";
        public static final String COLUMN_AMOUNT = "amount";
//        public static final String COLUMN_MEASURE = "measure";
    }

    /**
     *
     */
    public static final class NoteListEntry implements  BaseColumns {
        public static final String TABLE_NAME = "note_list";

        public static final String COLUMN_SUMMARY = "summary";
        public static final String COLUMN_PICTURE = "picture";
        public static final String COLUMN_PREP_TIME = "prep_time";
        public static final String COLUMN_COOK_TIME = "cook_time";
        public static final String COLUMN_DATE = "date";
    }

    /**
     *
     */
    public static final class IntructionListEntry implements BaseColumns {
        public static final String TABLE_NAME = "instruction_list";

        public static final String COLUMN_INSTRUCTION = "instruction";
        public static final String COLUMN_ORDER = "order";
    }
}
