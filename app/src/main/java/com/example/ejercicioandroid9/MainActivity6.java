package com.example.ejercicioandroid9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity6 extends AppCompatActivity {
Button pregunta5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        pregunta5=findViewById(R.id.button5);
        pregunta5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(intent);
            }
        });
    }
}