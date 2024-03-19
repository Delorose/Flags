package com.example.flags;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);
        ArrayList<DataFlags> list = new ArrayList<>();
        list.clear();

        list.add(new DataFlags(R.drawable.ru, R.string.russian, R.string.russhianRUB));
        list.add(new DataFlags(R.drawable.mf, R.string.france, R.string.franceEURO));
        list.add(new DataFlags(R.drawable.ua, R.string.ukraine, R.string.ukraineGRI));
        list.add(new DataFlags(R.drawable.us, R.string.usa, R.string.usaDOl));

        MyListAdapter myListAdapter = new MyListAdapter(this, list);
        listView.setAdapter(myListAdapter);
    }

}