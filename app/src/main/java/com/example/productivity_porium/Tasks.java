package com.example.productivity_porium;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class Tasks extends AppCompatActivity {


    EditText date1, date2;
    Calendar myCalendar;
    Button  buttonRegister;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);

        date1 =(EditText) findViewById(R.id.date1);
        date2 = (EditText) findViewById(R.id.date2);
        myCalendar = Calendar.getInstance();
        buttonRegister = findViewById(R.id.Registerbtn);

        DatePickerDialog.OnDateSetListener date = null;
        date1.setOnClickListener(view -> new DatePickerDialog(Tasks.this, null,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show());
        date2.setOnClickListener(view -> new DatePickerDialog(Tasks.this, null,myCalendar.get(Calendar.YEAR),myCalendar.get(Calendar.MONTH),myCalendar.get(Calendar.DAY_OF_MONTH)).show());
         updateLabel();
    }
    public void submitData(View view){
        startActivity(new Intent(this,DataViewActivity.class));
    }

    private void updateLabel(){
        String myFormat = "MM/dd/yy EEEE";
        SimpleDateFormat dateFormat = new SimpleDateFormat(myFormat, Locale.US);
        date1.setText(dateFormat.format(myCalendar.getTime()));
        date2.setText(dateFormat.format(myCalendar.getTime()));
    }
}