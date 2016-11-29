package com.example.carmen.juegodecartas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        final Button como =(Button)findViewById(R.id.como);
        final Button jugar = (Button)findViewById(R.id.jugar);

        jugar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent juego = new Intent(Principal.this, MainActivity.class);
                startActivity(juego);
            }
        });

        como.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                AlertDialog alertDialog = new AlertDialog.Builder(Principal.this).create();
                alertDialog.setTitle("Instrucciones");
                alertDialog.setMessage("Por turnos deberás cumplir un reto diferente mediante un toque de la baraja, si no cumples con tu reto, tendrás castigo. DIVIÉRTETE!");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();

            }
        });

    }
}
