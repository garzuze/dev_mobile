package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LocalizarESubstituir extends AppCompatActivity {

    TextView txtFrase, txtLocalizar, txtSubstituir;
    Button btnAplicar;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_localizar_esubstituir);

        txtFrase = findViewById(R.id.txtFrase);
        txtLocalizar = findViewById(R.id.txtLocalizar);
        txtSubstituir = findViewById(R.id.txtSubstituir);
        btnAplicar = findViewById(R.id.btnAplicar);

        btnAplicar.setOnClickListener(view -> {
            String localizar = String.valueOf(txtLocalizar.getText());
            String substituir = String.valueOf(txtSubstituir.getText());
            String frase = String.valueOf(txtFrase.getText());

            txtFrase.setText(frase.replaceAll(localizar, substituir));
        });
    }
}