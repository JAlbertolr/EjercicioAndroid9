package com.example.ejercicioandroid9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.graphics.Color;
import android.widget.Toast;
import android.widget.Button;
public class MainActivity7 extends AppCompatActivity {
TextView resul;
ImageView imagen;
ConstraintLayout cl;

Button repetir;
Button salir;

    TextView nombre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        resul = findViewById(R.id.puntuacionTotal);
        imagen = findViewById(R.id.imagenResultados);
        nombre = findViewById(R.id.textoNombreFinal);
        nombre.setText(Almacen.getNombre().toUpperCase().toString() + "*");
        cl = findViewById(R.id.constra);
        repetir=findViewById(R.id.btnRepetir);
         salir=findViewById(R.id.btnSalir);
        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int rs = (Almacen.getContador()) * 2;
        resul.setText(rs + "");

        if (rs >= 5) {
            // Si el resultado es mayor o igual a 5
            cl.setBackgroundColor(Color.GREEN); // Cambiar el fondo del ConstraintLayout
            imagen.setImageResource(R.drawable.greatjob);
            MediaPlayer successSound = MediaPlayer.create(this, R.raw.ganar);
            successSound.start();
        } else {
            // Si el resultado es menor a 5
            cl.setBackgroundColor(Color.RED);
            imagen.setImageResource(R.drawable.fallado);
            MediaPlayer failSound = MediaPlayer.create(this, R.raw.negative);
            failSound.start();
        }
      repetir.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Almacen.setContador(0);
              Intent intent=new Intent(MainActivity7.this,MainActivity2.class);
              startActivity(intent);
          }
      });
        salir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent=new Intent(MainActivity7.this,MainActivity.class);
            startActivity(intent);

            }
        });

    }
}