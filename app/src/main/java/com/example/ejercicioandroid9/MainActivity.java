package com.example.ejercicioandroid9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {
    Button inicio;
    EditText nom;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio = findViewById(R.id.btnInicio);
        nom = findViewById(R.id.textoNombre);
        mediaPlayer = MediaPlayer.create(this, R.raw.inicio);
        Almacen.setNombre("");
        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = nom.getText().toString().trim();

                if (nombre.isEmpty() || nombre.equals("*")) {
                    Toast.makeText(MainActivity.this, "Inserte su nombre", Toast.LENGTH_SHORT).show();
                } else {
                    Almacen.setNombre(nom.getText().toString());
                    mediaPlayer.start();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    try{
                        Thread.sleep(2000);
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    startActivity(intent);
                }
            }
        });
    }
}
