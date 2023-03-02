package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnLogin;
Button btnNovoJogo;
Button btnCarregarJogo;
Button btnEstatisticas;
Button btnSobre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener((View.OnClickListener) view -> {
            Intent in = new Intent(MainActivity.this, Login.class);
            startActivity(in);
        });

        btnNovoJogo=findViewById(R.id.btnNovoJogo);
        btnNovoJogo.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, NovoJogo.class);
            startActivity(in);
        });

        btnCarregarJogo=findViewById(R.id.btnCarregarJogo);
        btnCarregarJogo.setOnClickListener((View.OnClickListener) view -> {
            Intent in = new Intent(MainActivity.this, CarregarJogo.class);
            startActivity(in);
        });

        btnNovoJogo=findViewById(R.id.btnNovoJogo);
        btnNovoJogo.setOnClickListener(view -> {
            Intent in = new Intent(MainActivity.this, NovoJogo.class);
            startActivity(in);
        });
    }}