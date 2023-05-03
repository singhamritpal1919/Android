package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity {

    Button bttn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity3);

        bttn3 = findViewById(R.id.btn3);

        bttn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent int3 = new Intent(Activity3.this,MainActivity.class);
                startActivity(int3);

            }
        });
    }
}