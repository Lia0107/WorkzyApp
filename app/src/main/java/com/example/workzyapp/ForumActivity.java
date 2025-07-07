package com.example.workzyapp;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import androidx.appcompat.app.AppCompatActivity;
public class ForumActivity extends AppCompatActivity{
    ListView listView;
    DBHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        listView = findViewById(R.id.list_view);
        db = new DBHelper(this);
        Cursor c = db.getAllTodos();              // <- DB read

        // Map DB columns -> TextViews inside each row
        String[] from = {"todolist", "remark", "added_on"};
        int[]    to   = {R.id.txtTask, R.id.txtRemark, R.id.txtDate};

        SimpleCursorAdapter adapter = new SimpleCursorAdapter(
                this,
                R.layout.row_todo,               // row layout in step 3
                c,
                from,
                to,
                0
        );

        listView.setAdapter(adapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (db != null) db.close();
    }
}
