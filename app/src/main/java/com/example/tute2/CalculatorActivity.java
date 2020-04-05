package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.List;

public class CalculatorActivity extends AppCompatActivity {

    List<String> inputs;
    List<String> operators;

    String[] inp = {"1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "0", "C"};
    String[] op = {"+", "-","*", "/"};
    RecyclerView recyclerView1,recyclerView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        recyclerView1 = findViewById(R.id.recyclerviewfornumbers);
        recyclerView2 = findViewById(R.id.recyclerviewforoperators);
        //RecyclerAdapter r1 = new RecyclerAdapter()

    }
}
