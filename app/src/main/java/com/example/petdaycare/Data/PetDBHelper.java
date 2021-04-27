package com.example.petdaycare.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.petdaycare.Data.PetConcract.PetEntry;
import androidx.annotation.Nullable;

import java.sql.SQLClientInfoException;

public class PetDBHelper extends SQLiteOpenHelper {
    //Nombre BD
    private static final String DATABASE_NAME ="pets.db";

    //Version base de datos
    private static final int DATABASE_VERSION =1;

    public PetDBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
//El encargado de crear la BD
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String SQL_CREATE_PETS_TABLE = "CREATE TABLE " + PetEntry.TABLE_NAME +  "("
                + PetEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "  +
                PetEntry.COLUMN_PET_NAME + " TEXT NOT NULL, "  +
                PetEntry.COLUMN_PET_BREED + " TEXT NOT NULL, "  +
                PetEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0, "  +
                PetEntry.COLUMN_PET_GENDER + " TEXT NOT NULL);";
        sqLiteDatabase.execSQL(SQL_CREATE_PETS_TABLE);

    }
//Recibir el codigo de actualizacion de la BD
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
