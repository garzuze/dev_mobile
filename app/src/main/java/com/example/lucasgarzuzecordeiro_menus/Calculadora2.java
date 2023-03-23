package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora2 extends AppCompatActivity {
    final Button btnSoma2 = findViewById(R.id.btnSoma2);
    final Button btnSubtracao2 = findViewById(R.id.btnSubtracao2);
    final Button btnDivisao2 = findViewById(R.id.btnDivisao2);
    final Button btnMultiplicacao2 = findViewById(R.id.btnMultiplicacao2);
    final TextView txtNumero1 = findViewById(R.id.txtNumero1);
    final TextView txtNumero2 = findViewById(R.id.txtNumero2);
    final TextView txtResultado2 = findViewById(R.id.txtResultado2);
    Double num1, num2, num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora2);
        btnSoma2.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNumero1.getText().toString());
            num2 = Double.parseDouble(txtNumero2.getText().toString());
            double resultado = num1 + num2;
            String resultadoString = String.valueOf(resultado);
            txtResultado2.setText(resultadoString);
        });
        btnSubtracao2.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNumero1.getText().toString());
            num2 = Double.parseDouble(txtNumero2.getText().toString());
            double resultado = num1 - num2;
            String resultadoString = String.valueOf(resultado);
            txtResultado2.setText(resultadoString);
        });

        btnDivisao2.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNumero1.getText().toString());
            num2 = Double.parseDouble(txtNumero2.getText().toString());
            double resultado = num1 / num2;
            String resultadoString = String.valueOf(resultado);
            txtResultado2.setText(resultadoString);
        });

        btnMultiplicacao2.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNumero1.getText().toString());
            num2 = Double.parseDouble(txtNumero2.getText().toString());
            double resultado = num1 * num2;
            String resultadoString = String.valueOf(resultado);
            txtResultado2.setText(resultadoString);
        });
    }
}