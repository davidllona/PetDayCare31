package com.example.petdaycare;

import android.provider.BaseColumns;

public class UserContract {


    private UserContract(){
    }
    public static final class UserEntry implements BaseColumns{
        public final static String TABLE_NAME = "pets";

        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_USER_NAME = "name";
        public final static String COLUMN_USER_BREED = "breed";
        public final static String COLUMN_USER_WEIGTH = "weigth";
        public final static String COLUMN_USER_GENDER = "gender";


    }
}
