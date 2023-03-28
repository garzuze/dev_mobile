package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;

public class CalcularIMC extends AppCompatActivity {
    TextView txtPeso, txtAltura, txtIMC, txtCondicao;
    Button btnCalcularIMC;

    // Criando função para limitar os números decimais a duas casas
    private static final DecimalFormat df = new DecimalFormat("0.00");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_imc);
        txtPeso = findViewById(R.id.txtPeso);
        txtAltura = findViewById(R.id.txtAltura);
        txtIMC = findViewById(R.id.txtIMC);
        txtCondicao = findViewById(R.id.txtCondicao);
        btnCalcularIMC = findViewById(R.id.btnCalcularIMC);

        btnCalcularIMC.setOnClickListener(view -> {
            Double peso = Double.parseDouble(String.valueOf(txtPeso.getText()));
            Double altura = Double.parseDouble(String.valueOf(txtAltura.getText()));
            Double imc = peso / (altura * altura);
            txtIMC.setText("Seu IMC é: " + df.format((imc)).toString());

            if (imc < 18.5){
                txtCondicao.setText("Magreza");
            } else if (imc > 18.5 && imc < 24.9) {
                txtCondicao.setText("Normal");
            } else if (imc > 25 && imc < 29.9) {
                txtCondicao.setText("Sobrepeso");
            } else if (imc > 30 && imc < 39.9) {
                txtCondicao.setText("Obesidade");
            } else {
                txtCondicao.setText("Obesidade grave");
            }
        });

    }
}