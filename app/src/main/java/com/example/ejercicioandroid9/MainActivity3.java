package com.example.ejercicioandroid9;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Toast;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity3 extends AppCompatActivity {
Button pregunta2;
    RadioButton rb;
    RadioGroup rg;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        pregunta2=findViewById(R.id.btnPregunta2);

        rb=findViewById(R.id.antartida);
        rg=findViewById(R.id.radioGroup2);



        pregunta2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                if (rb.isChecked()) {
                    Almacen.incrementContador();
                    Toast.makeText(MainActivity3.this, "Respuesta correcta!", Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(MainActivity3.this, R.raw.succes);
                    mediaPlayer.start(); // Reproduce el sonido de acierto


                } else {
                     Toast.makeText(MainActivity3.this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(MainActivity3.this, R.raw.negative);
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