package com.example.workzyapp;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
public class DBHelper extends SQLiteOpenHelper {
    public DBHelper(Context context) {
        super(context, "todoDB", null, 1);
    }
    @Override public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE todo (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "todolist TEXT, " +
                "remark TEXT, " +
                "is_done INTEGER DEFAULT 0, " +
                "added_on TEXT)");
// Sample data
        db.execSQL("INSERT INTO todo (todolist, remark, is_done, added_on) VALUES" +
                "('Buy groceries', 'Eggs and milk', 0, '2025-07-06')," +
                "('Finish report', 'Due tomorrow', 1, '2025-07-05')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public Cursor getAllTodos() {
        SQLiteDatabase db = getReadableDatabase();
        return db.rawQuery("SELECT id AS _id, todolist, remark, added_on FROM todo", null);
        // NOTE:  "_id" is mandatory for SimpleCursorAdapter
    }
}
