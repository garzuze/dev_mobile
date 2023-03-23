package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraNovaTela extends AppCompatActivity {

    Button btnSum, btnSub, btnMult, btnDiv;
    TextView txtNum1, txtNum2;
    Double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_nova_tela);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);

        btnSum.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());

            double resultado = num1 + num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(CalculadoraNovaTela.this, Resultado.class);
            in.putExtra("resultado", resultString);
            startActivity(in);
        });

        btnSub.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());

            double resultado = num1 - num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(CalculadoraNovaTela.this, Resultado.class);
            in.putExtra("resultado", resultString);
            startActivity(in);
        });

        btnMult.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());

            double resultado = num1 * num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(CalculadoraNovaTela.this, Resultado.class);
            in.putExtra("resultado", resultString);
            startActivity(in);
        });

        btnDiv.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());

            double resultado = num1 / num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(CalculadoraNovaTela.this, Resultado.class);
            in.putExtra("resultado", resultString);
            startActivity(in);
        });
    }
}