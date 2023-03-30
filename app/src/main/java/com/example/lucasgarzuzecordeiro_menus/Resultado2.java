package com.example.lucasgarzuzecordeiro_menus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Resultado2 extends AppCompatActivity {
    TextView txtResultNovaTela;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultNovaTela = findViewById(R.id.txtResultNovaTela);

        Intent it = getIntent();
        String resultado = it.getStringExtra("resultado");
        txtResultNovaTela.setText(resultado);
    }
}