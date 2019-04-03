package com.sena.pruebapoo;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void botonVentana(View view) {

        Date fechaActual = new Date();
        long hora = fechaActual.getTime();
        if (hora <  57600000){
            Intent intent = new  Intent(MainActivity.this,ventana_error.class);
            startActivity(intent);

        }
        else{

                Intent intent = new Intent(MainActivity.this, ventana_logro.class);
                startActivity(intent);

        }


    }
}
