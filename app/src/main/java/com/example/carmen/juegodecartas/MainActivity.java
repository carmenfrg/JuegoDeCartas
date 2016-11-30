package com.example.carmen.juegodecartas;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
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

import static android.R.id.list;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Resources res = getResources();
        final String uno = res.getString(R.string.reto_uno);
        final String dos = res.getString(R.string.reto_dos);
        final String tres = res.getString(R.string.reto_tres);
        final String cuatro = res.getString(R.string.reto_cuatro);
        final String cinco = res.getString(R.string.reto_cinco);
        final String seis = res.getString(R.string.reto_seis);
        final String siete = res.getString(R.string.reto_siete);
        final String ocho = res.getString(R.string.reto_ocho);
        final String nueve = res.getString(R.string.reto_nueve);
        final String diez = res.getString(R.string.reto_diez);
        final String once = res.getString(R.string.reto_once);
        final String doce = res.getString(R.string.reto_doce);
        final String trece = res.getString(R.string.reto_trece);


        final ImageButton boton = (ImageButton)findViewById(R.id.boton);
        final ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(R.drawable.c1); list.add(R.drawable.c2);list.add(R.drawable.c3); list.add(R.drawable.c4);
        list.add(R.drawable.c5); list.add(R.drawable.c6); list.add(R.drawable.c7); list.add(R.drawable.c8);
        list.add(R.drawable.c9); list.add(R.drawable.c10);list.add(R.drawable.c11); list.add(R.drawable.c12);
        list.add(R.drawable.c13); list.add(R.drawable.c14); list.add( R.drawable.c15); list.add(R.drawable.c16);
        list.add(R.drawable.c17); list.add(R.drawable.c18); list.add(R.drawable.c19);list.add(R.drawable.c20);
        list.add(R.drawable.c21); list.add(R.drawable.c22); list.add(R.drawable.c23); list.add(R.drawable.c24);
        list.add(R.drawable.c25); list.add(R.drawable.c26);list.add(R.drawable.c27); list.add(R.drawable.c28);
        list.add(R.drawable.c29); list.add(R.drawable.c30); list.add(R.drawable.c31);list.add(R.drawable.c32);
        list.add(R.drawable.c33); list.add(R.drawable.c34); list.add(R.drawable.c35); list.add(R.drawable.c36);
        list.add(R.drawable.c37); list.add(R.drawable.c38); list.add(R.drawable.c39); list.add(R.drawable.c40);
        list.add(R.drawable.c41); list.add(R.drawable.c42); list.add(R.drawable.c43); list.add(R.drawable.c44);
        list.add(R.drawable.c45); list.add(R.drawable.c46); list.add(R.drawable.c47); list.add(R.drawable.c48);
        list.add(R.drawable.c49); list.add(R.drawable.c50); list.add(R.drawable.c51); list.add(R.drawable.c52);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int position = new Random().nextInt(list.size());
                boton.setImageResource(list.get(position));

                int max = 52;
                List<Integer> indices = new ArrayList<Integer>(max);
                for(int c = 0; c < max; ++c)
                {
                    indices.add(c);
                }
                int ran = new Random().nextInt(indices.size());

                if(position == 0 || position == 1 || position == 2 || position == 3){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(uno);
                    Dialog d = b.create();
                    d.show();
                } else if (position == 4 || position == 5 || position == 6 || position == 7){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(dos);
                    Dialog d = b.create();
                    d.show();
                }else if (position == 8 || position == 9 || position == 10 || position == 11){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(tres);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 12 || position == 13 || position == 15 || position == 16){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(cuatro);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 17 || position == 18 || position == 19 || position == 20){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(cinco);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 21 || position == 22 || position == 23 || position == 24){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(seis);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 25 || position == 26 || position == 27 || position == 28){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(siete);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 29 || position == 30 || position == 31 || position == 32){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(ocho);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 33 || position == 34 || position == 35 || position == 37){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(nueve);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 38 || position == 39 || position == 40 || position == 41){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(diez);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 42 || position == 43 || position == 44 || position == 45){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(once);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 46 || position == 47 || position == 48 || position == 49){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(doce);
                    Dialog d = b.create();
                    d.show();
                }else if(position == 14 || position == 36 || position == 50 || position == 51){
                    AlertDialog.Builder b = new AlertDialog.Builder(MainActivity.this);
                    b.setMessage(trece);
                    Dialog d = b.create();
                    d.show();
                }


                indices.remove(ran);
                list.remove(position);
                if (list.isEmpty()){
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Felicidades!");
                    alertDialog.setMessage("El juego ha terminado, ¿qué deseas hacer?");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }

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
