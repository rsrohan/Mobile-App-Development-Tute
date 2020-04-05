package com.example.tute2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TUTE3Activity extends AppCompatActivity {
    Button toast, sum;
    EditText input1, input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tute3);
        toast = findViewById(R.id.showToast);

        sum = findViewById(R.id.sum);
        input1 = findViewById(R.id.input1);
        input2 =findViewById(R.id.input2);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TUTE3Activity.this, "THIS IS A TOAST MESSAGE", Toast.LENGTH_SHORT).show();
            }
        });

        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int i = Integer.parseInt(input1.getText().toString());
                    int j = Integer.parseInt(input2.getText().toString());

                    Toast.makeText(TUTE3Activity.this, "sum: "+(i+j), Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(TUTE3Activity.this, ""+e, Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}
