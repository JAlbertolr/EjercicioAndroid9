package com.example.ejercicioandroid9;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity4 extends AppCompatActivity {
Button pregunta3;
    RadioButton rb;
    RadioGroup rg;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        pregunta3=findViewById(R.id.btnPregunta3);

        rb=findViewById(R.id.leo);
        rg=findViewById(R.id.radioGroup3);
        pregunta3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity4.this, MainActivity5.class);
                if (rb.isChecked()) {
                    Almacen.incrementContador();
                    //Toast.makeText(MainActivity2.this, "Respuesta correcta!", Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(MainActivity4.this, R.raw.succes);
                    mediaPlayer.start();


                } else {
                    // Toast.makeText(MainActivity2.this, "Respuesta incorrecta", Toast.LENGTH_SHORT).show();
                    mediaPlayer = MediaPlayer.create(MainActivity4.this, R.raw.negative);
                    mediaPlayer.start();
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