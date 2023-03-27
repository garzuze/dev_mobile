package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MemoriaResposta extends AppCompatActivity {

    Button btnEnviar;
    TextView txtResposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memoria_resposta);


        btnEnviar=findViewById(R.id.btnEnviar);
        txtResposta=findViewById(R.id.txtResposta);

        btnEnviar.setOnClickListener(view -> {
            String resposta = txtResposta.getText().toString();
            Intent in = new Intent(MemoriaResposta.this, MemoriaResultado.class);
            in.putExtra("resposta", resposta);
            startActivity(in);
        });

    }
}