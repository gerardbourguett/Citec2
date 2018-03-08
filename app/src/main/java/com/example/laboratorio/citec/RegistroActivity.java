package com.example.laboratorio.citec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.laboratorio.citec.objetos.Adam;
import com.example.laboratorio.citec.objetos.Constructora;
import com.example.laboratorio.citec.objetos.FirebaseReferences;
import com.example.laboratorio.citec.objetos.ID_Constructora;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class RegistroActivity extends AppCompatActivity {

    private EditText idProyecto, rutCons,encargado,razonSocial,direccion,poblacion,comuna,telefono;
    private EditText id, dato1,dato2,dato3,dato4,dato5,dato6,dato7,dato8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        idProyecto = findViewById(R.id.et_id);
        rutCons = findViewById(R.id.et_rut);
        encargado = findViewById(R.id.et_encargado);
        razonSocial = findViewById(R.id.et_razon);
        direccion = findViewById(R.id.et_direccion);
        poblacion = findViewById(R.id.et_poblacion);
        comuna = findViewById(R.id.et_comuna);
        telefono = findViewById(R.id.et_telefono);
        id = findViewById(R.id.et_idAdam);
        dato1 = findViewById(R.id.et_dato1);
        dato2 = findViewById(R.id.et_dato2);
        dato3 = findViewById(R.id.et_dato3);
        dato4 = findViewById(R.id.et_dato4);
        dato5 = findViewById(R.id.et_dato5);
        dato6 = findViewById(R.id.et_dato6);
        dato7 = findViewById(R.id.et_dato7);
        dato8 = findViewById(R.id.et_dato8);
        Button btnRut = findViewById(R.id.btn_rut);
        Button btnVolver = findViewById(R.id.btn_volverRH);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference(FirebaseReferences.CONSTRUCTORA_REFERENCE);

        btnRut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String rut = rutCons.getText().toString();
                String idAdam = id.getText().toString();
                Constructora constructora = new Constructora(idProyecto.getText().toString(), encargado.getText().toString() , razonSocial.getText().toString() , direccion.getText().toString()
                        , poblacion.getText().toString() , comuna.getText().toString() , telefono.getText().toString() );
                Adam adam = new Adam(id.getText().toString(), dato1.getText().toString() , dato2.getText().toString() , dato3.getText().toString() ,
                        dato4.getText().toString() , dato5.getText().toString(), dato6.getText().toString(), dato7.getText().toString(), dato8.getText().toString() ) ;
                myRef.child(rut).setValue(constructora);
                myRef.child(rut).child(FirebaseReferences.ADAM_REFERENCE).child(idAdam).setValue(adam);
                Toast.makeText(RegistroActivity.this, "Datos Registrados Correctamente", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(RegistroActivity.this , DatosActivity.class);
                startActivity(intent);
            }
        });

        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegistroActivity.this , HomeActivity.class);
                startActivity(intent);
            }
        });



    }
}
