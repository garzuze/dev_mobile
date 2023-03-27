package com.example.lucasgarzuzecordeiro_menus;

import static com.example.lucasgarzuzecordeiro_menus.R.id.txtCertoOuErrado;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MemoriaResultado extends AppCompatActivity {

    TextView txtCertoOuErrado;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria_resultado);

        txtCertoOuErrado = findViewById(R.id.txtCertoOuErrado);
        Intent it = getIntent();
        String resposta = it.getStringExtra("resposta");
        if (resposta.equalsIgnoreCase("G4L0SN1P3R")){
            txtCertoOuErrado.setText("Acertou!");
        } else {
            txtCertoOuErrado.setText("Errou!");
        }

    }
}