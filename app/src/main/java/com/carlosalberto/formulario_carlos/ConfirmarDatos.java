package com.carlosalberto.formulario_carlos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ConfirmarDatos extends AppCompatActivity {

    TextView txtvNombre;
    TextView txtvFecha;
    TextView txtvTelefono;
    TextView txtvEmail;
    TextView txtvDescripcion;
    String[] datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros = getIntent().getExtras();

        datos = parametros.getStringArray("datos");

        txtvNombre = (TextView) findViewById(R.id.txtvNombre);
        txtvFecha = (TextView) findViewById(R.id.txtvFecha);
        txtvTelefono = (TextView) findViewById(R.id.txtvTelefono);
        txtvEmail = (TextView) findViewById(R.id.txtvEmail);
        txtvDescripcion = (TextView) findViewById(R.id.txtvDescripcion);

        txtvNombre.setText(" " + datos[0]);
        txtvFecha.setText(" " + datos[1]);
        txtvTelefono.setText(" " + datos[2]);
        txtvEmail.setText(" " + datos[3]);
        txtvDescripcion.setText(" " + datos[4]);
    }

    public void editarDatos(View v){
        finish();
    }
}
