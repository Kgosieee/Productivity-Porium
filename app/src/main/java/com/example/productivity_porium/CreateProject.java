package com.example.productivity_porium;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class CreateProject extends AppCompatActivity {


    EditText Name, Description;
    TextView Create, Names, Descriptions;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_project);


        Name = findViewById(R.id.project_name);
        Description = findViewById(R.id.project_Description);
        Create =  findViewById(R.id.create_project);
        Names = findViewById(R.id.create_new_project);
        Descriptions = findViewById(R.id.Description);
        btn = findViewById(R.id.Buttons);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTasks();
            }
        });




    }

    public void openTasks(){
        Intent intent = new Intent(this, Tasks.class);
        startActivity(intent);
    }
}