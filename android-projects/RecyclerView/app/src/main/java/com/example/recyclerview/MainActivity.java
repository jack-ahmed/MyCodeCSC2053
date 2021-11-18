package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mordList = new LinkedList<>();
    private RecyclerView mecyclerView;
    private WordListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for (int i = 0; i < 20; i++) {
            mordList.add("Word " + i);
        }
        mecyclerView = findViewById(R.id.recyclerView);
        mecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new WordListAdapter(this, mordList);
        mecyclerView.setAdapter(mAdapter);
    }
}