package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraSimples extends AppCompatActivity {
Button btnSoma, btnSubtracao, btnDivisao, btnMultiplicacao;
TextView txtVisorCalculadoraSimples;
TextView txtVisorCalculadoraSimples2;
TextView txtResultado;
Double num1, num2, num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_simples);

        btnSoma=findViewById(R.id.btnSoma);
        btnSubtracao=findViewById(R.id.btnSubtracao);
        btnDivisao=findViewById(R.id.btnDivisao);
        btnMultiplicacao=findViewById(R.id.btnMultiplicacao);
        txtVisorCalculadoraSimples=findViewById(R.id.txtVisorCalculadoraSimples);
        txtVisorCalculadoraSimples2=findViewById(R.id.txtVisorCalculadoraSimples2);
        txtResultado=findViewById(R.id.txtResultado);
        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(txtVisorCalculadoraSimples.getText().toString());
                num2 = Double.parseDouble(txtVisorCalculadoraSimples2.getText().toString());
                double resultado = num1 + num2;
                String resultadoString = String.valueOf(resultado);
                txtResultado.setText(resultadoString);
            }
        });
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(txtVisorCalculadoraSimples.getText().toString());
                num2 = Double.parseDouble(txtVisorCalculadoraSimples2.getText().toString());
                double resultado = num1 - num2;
                String resultadoString = String.valueOf(resultado);
                txtResultado.setText(resultadoString);
            }
        });

        btnDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(txtVisorCalculadoraSimples.getText().toString());
                num2 = Double.parseDouble(txtVisorCalculadoraSimples2.getText().toString());
                double resultado = num1 / num2;
                String resultadoString = String.valueOf(resultado);
                txtResultado.setText(resultadoString);
            }
        });

        btnMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Double.parseDouble(txtVisorCalculadoraSimples.getText().toString());
                num2 = Double.parseDouble(txtVisorCalculadoraSimples2.getText().toString());
                double resultado = num1 * num2;
                String resultadoString = String.valueOf(resultado);
                txtResultado.setText(resultadoString);
            }
        });

    }
}