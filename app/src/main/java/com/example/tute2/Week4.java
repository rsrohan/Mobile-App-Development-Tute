package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Week4 extends AppCompatActivity {

    Button ShowToast, click;
    TextView textView;
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ShowToast = findViewById(R.id.showToast);
        click = findViewById(R.id.count);
        textView = findViewById(R.id.showMessage);

        ShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Week4.this, "waka waka", Toast.LENGTH_SHORT).show();
            }
        });

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = i+1;
                textView.setText(""+i);
            }
        });


    }
}
