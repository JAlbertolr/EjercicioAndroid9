package com.example.ejercicioandroid9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.media.MediaPlayer;
import android.graphics.Color;

public class MainActivity7 extends AppCompatActivity {
TextView resul;
ImageView imagen;
ConstraintLayout cl;


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
            cl.setBackgroundColor(Color.RED); // Cambiar el fondo del ConstraintLayout
            imagen.setImageResource(R.drawable.fallado);
            MediaPlayer failSound = MediaPlayer.create(this, R.raw.negative);
            failSound.start();
        }
    }
}