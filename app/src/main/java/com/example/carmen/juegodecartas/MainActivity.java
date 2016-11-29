package com.example.carmen.juegodecartas;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button sejuegasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        sejuegasi =(Button)findViewById(R.id.sejuegasi);

        sejuegasi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent sejuegasi = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(sejuegasi);
            }
        });

        final ImageButton boton = (ImageButton)findViewById(R.id.boton);
        final ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.drawable.c1); list.add(R.drawable.c2);list.add(R.drawable.c3); list.add(R.drawable.c4);
        list.add(R.drawable.c5); list.add(R.drawable.c6); list.add(R.drawable.c7); list.add(R.drawable.c8);list.add(R.drawable.c9);
        list.add(R.drawable.c10);list.add(R.drawable.c11); list.add(R.drawable.c12); list.add(R.drawable.c13); list.add(R.drawable.c14);
        list.add(R.drawable.c16); list.add(R.drawable.c17); list.add(R.drawable.c18); list.add(R.drawable.c19);list.add(R.drawable.c20);
        list.add(R.drawable.c21); list.add(R.drawable.c22); list.add(R.drawable.c23); list.add(R.drawable.c24); list.add(R.drawable.c25);
        list.add(R.drawable.c26);list.add(R.drawable.c27); list.add(R.drawable.c28); list.add(R.drawable.c29); list.add(R.drawable.c30);
        list.add(R.drawable.c31);list.add(R.drawable.c32); list.add(R.drawable.c33); list.add(R.drawable.c34); list.add(R.drawable.c35);
        list.add(R.drawable.c36); list.add(R.drawable.c37); list.add(R.drawable.c38); list.add(R.drawable.c39); list.add(R.drawable.c40);
        list.add(R.drawable.c41); list.add(R.drawable.c42); list.add(R.drawable.c43); list.add(R.drawable.c44); list.add(R.drawable.c45);
        list.add(R.drawable.c46); list.add(R.drawable.c47); list.add(R.drawable.c48); list.add(R.drawable.c49); list.add(R.drawable.c50);
        list.add(R.drawable.c51); list.add(R.drawable.c52); list.add( R.drawable.c15);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int position = new Random().nextInt(list.size());
                boton.setImageResource(list.get(position));
                list.remove(position);

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {
            System.exit(0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
