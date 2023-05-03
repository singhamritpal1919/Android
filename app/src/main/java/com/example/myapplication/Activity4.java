package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity4 extends AppCompatActivity {

    CheckBox Pizza, Icecream, Coffee;
    Button order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        Pizza = findViewById(R.id.Pizza);
        Icecream = findViewById(R.id.Icecream);
        Coffee = findViewById(R.id.Coffee);

        order = findViewById(R.id.Order);

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("The order include :");

                if(Pizza.isChecked()){
                    result.append("\n Pizza got selected");
                }

                if (Icecream.isChecked()){
                    result.append("\n Icecream got selected");
                }

                if (Coffee.isChecked()){
                    result.append("\n Coffee got Selected");
                }

                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();
            }
        });





    }
}