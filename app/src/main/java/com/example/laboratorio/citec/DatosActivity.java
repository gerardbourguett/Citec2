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

public class DatosActivity extends AppCompatActivity {

    private EditText dato1,dato2,dato3,dato4,dato5,dato6,dato7,dato8;
    private Button rAdam,volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        volver = findViewById(R.id.btn_volver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DatosActivity.this , RegistroActivity.class);
                startActivity(intent);
            }
        });
    }
}
