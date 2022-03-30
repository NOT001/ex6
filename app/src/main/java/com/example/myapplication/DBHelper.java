package com.example.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME="dangky.db";
    public DBHelper(Context context) {
        super(context, "dangky.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("tao table nguoidung(tendangnhap TEXT primary key, matkhau TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
    db.execSQL("tha bang neu ton tai ngưoi dung");
    }


}
