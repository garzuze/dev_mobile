package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import java.math.RoundingMode;
import java.text.DecimalFormat;


public class Conversao extends AppCompatActivity {

    TextView txtReal;
    TextView txtDolar;
    Button btnConverterBRL;
    Button brnConverterUSD;
    // Criando função para limitar os números decimais a duas casas
    private static final DecimalFormat df = new DecimalFormat("0.00"); /
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversao);

        txtReal = findViewById(R.id.txtReal);
        txtDolar = findViewById(R.id.txtDolar);
        btnConverterBRL = findViewById(R.id.btnConverterBRL);
        brnConverterUSD = findViewById(R.id.btnConverterUSD);

        btnConverterBRL.setOnClickListener(view -> {
            Double valorDolar = Double.parseDouble(txtReal.getText().toString()) * 0.19;
            txtDolar.setText(df.format(valorDolar).toString());
        });

        brnConverterUSD.setOnClickListener(view -> {
            Double valorReal = Double.parseDouble(txtDolar.getText().toString()) / 0.19;
            txtReal.setText(df.format(valorReal).toString());
        });

    }
}