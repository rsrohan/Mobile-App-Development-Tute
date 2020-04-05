package com.example.tute2;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Week9Ques1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        int hour = 0, minute = 0;
        final TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                if (hourOfDay>=12)
                {
                    if(hourOfDay>=13)
                    {
                        Toast.makeText(Week9Ques1.this, "Time selected is "+(hourOfDay-12)+" : "+minute+" PM", Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(Week9Ques1.this, "Time selected is "+(hourOfDay)+":"+minute+" PM", Toast.LENGTH_SHORT).show();
                    }

                }else{
                    if (hourOfDay==0)
                    {
                        Toast.makeText(Week9Ques1.this, "Time selected is "+(hourOfDay+12)+":"+minute+" AM", Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(Week9Ques1.this, "Time selected is "+(hourOfDay)+":"+minute+" AM", Toast.LENGTH_SHORT).show();

                    }

                }
            }
        }, hour, minute, true);
        timePickerDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                timePickerDialog.show();
            }
        });
        timePickerDialog.show();

//        int year=0, month=0, dayofmonth = 0;
//        DatePickerDialog datePickerDialog= new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
//            @Override
//            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
//                Toast.makeText(Main3Activity.this, year+" "+month+" "+dayOfMonth, Toast.LENGTH_SHORT).show();
//            }
//        }, year, month, dayofmonth);
        //datePickerDialog.show();
        //Toast.makeText(this, "", Toast.LENGTH_SHORT).setView().show();
    }
}
