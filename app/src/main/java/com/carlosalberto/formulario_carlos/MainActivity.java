package com.carlosalberto.formulario_carlos;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout txtinpNombre;
    private TextInputLayout txtinpFecha;
    private TextInputLayout txtinpTelefono;
    private TextInputLayout txtinpEmail;
    private TextInputLayout txtinpDescripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarActividad(View v) {

        String[] datos = new String[5];

        txtinpNombre = (TextInputLayout) findViewById(R.id.txtinpNombre);
        txtinpFecha = (TextInputLayout) findViewById(R.id.txtinpFecha);
        txtinpTelefono = (TextInputLayout) findViewById(R.id.txtinpTelefono);
        txtinpEmail = (TextInputLayout) findViewById(R.id.txtinpEmail);
        txtinpDescripcion = (TextInputLayout) findViewById(R.id.txtinpDescripcion);

        datos[0] = txtinpNombre.getEditText().getText().toString();
        datos[1] = txtinpFecha.getEditText().getText().toString();
        datos[2] = txtinpTelefono.getEditText().getText().toString();
        datos[3] = txtinpEmail.getEditText().getText().toString();
        datos[4] = txtinpDescripcion.getEditText().getText().toString();

        Intent i = new Intent(this, ConfirmarDatos.class);
        i.putExtra("datos", datos);
        startActivity(i);
        //finish();
    }

}
