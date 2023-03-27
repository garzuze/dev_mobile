package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class JogoDaMemoria extends AppCompatActivity {

    Button btnMemorizei;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo_da_memoria);

        btnMemorizei=findViewById(R.id.btnMemorizei);
        btnMemorizei.setOnClickListener(view -> {
            Intent in = new Intent(JogoDaMemoria.this, MemoriaResposta.class);
            startActivity(in);
        });

    }
}