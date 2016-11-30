package com.example.carmen.juegodecartas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final TextView TextV = (TextView)findViewById(R.id.TextV);
        final Button regresa = (Button)findViewById(R.id.regresa);

        int num = new Random().nextInt(52);

        if (num==1){
            TextV.setText("Prueba Regla 1");
        }

        regresa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent reglas = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(reglas);
            }
        });
    }
}
