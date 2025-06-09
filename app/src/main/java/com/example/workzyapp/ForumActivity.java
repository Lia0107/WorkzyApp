package com.example.workzyapp;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
public class ForumActivity extends AppCompatActivity{
    ListView listView;
    String[] oldchats = {"Chats with Alice","Chat with Bob","Chat with Carol"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        listView = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, oldChats);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(ForumActivity.this, ChatActivity.class);
            intent.putExtra("chatId", position);
            startActivity(intent);
        });
    }

}
