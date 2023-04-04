package com.example.productivity_porium;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productivity_porium.Adapter.TaskAdapter;

public class DataViewActivity extends AppCompatActivity {

    RecyclerView recycler_view;
    TaskAdapter taskAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_view);

        recycler_view = findViewById(R.id.recycle_view);
        recycler_view.setLayoutManager(new LinearLayoutManager(this));
        taskAdapter = new TaskAdapter(this);
        recycler_view.setAdapter(taskAdapter);
    }
}
