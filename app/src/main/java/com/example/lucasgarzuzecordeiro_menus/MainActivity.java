package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCalculadoraSimples;
    Button btnCalculadora2;
    Button btnCalculadora3;
    Button btnJogodaMemoria;
    Button btnConversao;
    Button btnIMC;
    Button btnLocalizarESubstituir;
    Button btnGerarAleatorio;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculadoraSimples=findViewById(R.id.btnCalculadoraSimples);
        btnCalculadoraSimples.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, CalculadoraSimples.class);
            startActivity(in);
        });

        btnCalculadora2=findViewById(R.id.btnCalculadora2);
        btnCalculadora2.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, CalculadoraNovaTela.class);
            startActivity(in);
        });

        btnJogodaMemoria=findViewById(R.id.btnJogodaMemoria);
        btnJogodaMemoria.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, JogoDaMemoria.class);
            startActivity(in);
        });

        btnConversao=findViewById(R.id.btnConversao);
        btnConversao.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, Conversao.class);
            startActivity(in);
        });

        btnIMC=findViewById(R.id.btnIMC);
        btnIMC.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, CalcularIMC.class);
            startActivity(in);
        });

        btnLocalizarESubstituir=findViewById(R.id.btnLocalizarESubstituir);
        btnLocalizarESubstituir.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, LocalizarESubstituir.class);
            startActivity(in);
        });
    }}