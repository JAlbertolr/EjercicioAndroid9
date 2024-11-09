package com.example.ejercicioandroid9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity2 extends AppCompatActivity {
Button pregunta1;
RadioButton rb;
RadioGroup rg;
MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        pregunta1=findViewById(R.id.btnPregunta1);
        pregunta1=findViewById(R.id.btnPregunta1);

        rb=findViewById(R.id.rapiña);
        rg=findViewById(R.id.radioGroup);


        pregunta1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                // Verifica si el RadioButton "rapiña" está seleccionado
                if (rb.isChecked()) {
                    Almacen.incrementContador();// Aumenta el contador en 2
                    //Toast.makeText(MainActivity2.this, "Respuesta correcta!", Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.succes); // Reemplaza "acierto.mp3" con el nombre de tu archivo de sonido de acierto
                    mediaPlayer.start(); // Reproduce el sonido de acierto



                } else {
                   // Toast.makeText(MainActivity2.this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(MainActivity2.this, R.raw.negative); // Reemplaza "error.mp3" con el nombre de tu archivo de sonido de error
                    mediaPlayer.start(); // Reproduce el sonido de error
                }
                try{
                    Thread.sleep(2000);
                }catch(Exception e){
                    e.printStackTrace();
                }
                //Toasty.success(this, "Operación exitosa", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });
    }
}