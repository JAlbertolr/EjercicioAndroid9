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

        inicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nom == null || nom.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "Inserte su nombre", Toast.LENGTH_SHORT).show();
                } else {
                    Almacen.setNombre(nom.getText().toString());
                    mediaPlayer.start();
                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);
                }
            }
        });
    }
}
