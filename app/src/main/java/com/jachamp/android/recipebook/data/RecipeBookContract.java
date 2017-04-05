package com.jachamp.android.recipebook.data;

import android.net.Uri;
import android.provider.BaseColumns;

/**
 * Defines the tables and column names for the recipe book database.
 *
 * @author James Champ
 * @version 1.0, 5 April 2017
 */

public final class RecipeBookContract {
    /**
     * Name of the content provider.
     */
    public static final String CONTENT_AUTHORITY = "com.jachamp.android.recipebook";

    /**
     * Base of all URI's that apps will use to contact RecipeBook's content provider.
     */
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);

    /**
     * Path for recipe table.
     */
    public static final String PATH_RECIPE = "recipe";

    /**
     * Path for tag list table.
     */
    public static final String PATH_TAG_LIST = "tag_list";

    /**
     * Path for ingredient list table.
     */
    public static final String PATH_INGREDIENT_LIST = "ingredient_list";

    /**
     * Path for note list table.
     */
    public static final String PATH_NOTE_LIST = "note_list";

    /**
     * Path for instruction list table.
     */
    public static final String PATH_INSTRUCTION_LIST = "instruction_list";

    /**
     * Prevents class from being instantiated.
     */
    private RecipeBookContract() {}

    //TODO: Add comments to inner classes

    /**
     *  This class defines the columns and file path for the recipe table.
     */
    public static class RecipeEntry implements BaseColumns {
        public static final Uri RECIPE_ENTRY_CONTENT_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_RECIPE)
                .build();

        public static final String TABLE_NAME = "recipes";

        public static final String COLUMN_INGREDIENT_LIST = "ingredient_list";
        public static final String COLUMN_INSTRUCTION_LIST = "instruction_list";
        public static final String COLUMN_PICTURE = "picture";
        public static final String COLUMN_NOTE_LIST = "note_list";
        public static final String COLUMN_PREP_TIME = "prep_time";
        public static final String COLUMN_COOK_TIME = "cook_time";
        public static final String COLUMN_RECIPE_NAME = "recipe_name";
        public static final String COLUMN_TYPE = "type";
        public static final String COLUMN_TAG_LIST = "tag_list";
        public static final String COLUMN_DATE_ADDED = "date_added";
    }

    /**
     *  This class defines the columns and file path for the tag list table.
     */
    public static final class TagListEntry implements BaseColumns {
        public static final Uri TAG_LIST_CONTENT_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_TAG_LIST)
                .build();

        public static final String TABLE_NAME = "tag_list";

        public static final String COLUMN_TAG = "tag";
    }

    /**
     *  This class defines the columns and file path for the ingredient list table.
     */
    public static final class IngredientListEntry implements BaseColumns {
        public static final Uri INGREDIENT_LIST_CONTENT_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_INGREDIENT_LIST)
                .build();

        public static final String TABLE_NAME = "ingredient_list";

        public static final String COLUMN_INGREDIENT = "ingredient";
        public static final String COLUMN_DESCRIPTION = "description";
        public static final String COLUMN_AMOUNT = "amount";
        public static final String COLUMN_ORDER = "ingredient_order";
    }

    /**
     *  This class defines the columns and file path for the note list table.
     */
    public static final class NoteListEntry implements  BaseColumns {
        public static final Uri NOTE_LIST_CONTENT_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_NOTE_LIST)
                .build();

        public static final String TABLE_NAME = "note_list";

        public static final String COLUMN_NOTE = "note";
        public static final String COLUMN_PICTURE = "picture";
        public static final String COLUMN_PREP_TIME = "prep_time";
        public static final String COLUMN_COOK_TIME = "cook_time";
        public static final String COLUMN_DATE = "date_added";
    }

    /**
     *  This class defines the columns and file path for the instruction list table.
     */
    public static final class InstructionListEntry implements BaseColumns {
        public static final Uri INSTRUCTION_LIST_CONTENT_URI = BASE_CONTENT_URI.buildUpon()
                .appendPath(PATH_INSTRUCTION_LIST)
                .build();

        public static final String TABLE_NAME = "instruction_list";

        public static final String COLUMN_INSTRUCTION = "instruction";
        public static final String COLUMN_ORDER = "instruction_order";
    }
}
