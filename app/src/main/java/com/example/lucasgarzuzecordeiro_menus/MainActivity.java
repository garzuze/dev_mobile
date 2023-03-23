package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnCalculadoraSimples;
Button btnCalculadora2;
Button btnCarregarJogo;
Button btnEstatisticas;
Button btnSobre;

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

        btnCarregarJogo=findViewById(R.id.btnCarregarJogo);
        btnCarregarJogo.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, CarregarJogo.class);
            startActivity(in);
        });

        btnEstatisticas=findViewById(R.id.btnEstatisticas);
        btnEstatisticas.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, Estatisticas.class);
            startActivity(in);
        });

        btnSobre=findViewById(R.id.btnSobre);
        btnSobre.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, Sobre.class);
            startActivity(in);
        });
    }}