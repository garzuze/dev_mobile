package com.example.lucasgarzuzecordeiro_menus;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calculadora3 extends AppCompatActivity {

    Button btnSum, btnSub, btnMult, btnDiv;
    TextView txtNum1, txtNum2;
    Double num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora3);
        btnSum = findViewById(R.id.btnSum);
        btnSub = findViewById(R.id.btnSub);
        btnMult = findViewById(R.id.btnMult);
        btnDiv = findViewById(R.id.btnDiv);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);

        Intent it = getIntent();
        String number1 = it.getStringExtra("numero1");
        String number2 = it.getStringExtra("numero2");
        txtNum1.setText(number1);
        txtNum2.setText(number2);

        btnSum.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());
            
            double numero1 = num1;
            double numero2 = num2;

            double resultado = num1 + num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(Calculadora3.this, Resultado2.class);
            in.putExtra("resultado", resultString);
            in.putExtra("numero1", numero1);
            in.putExtra("numero2", numero2);
            
            startActivity(in);
        });

        btnSub.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());

            double numero1 = num1;
            double numero2 = num2;
            
            double resultado = num1 - num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(Calculadora3.this, Resultado2.class);
            in.putExtra("resultado", resultString);
            in.putExtra("numero1", numero1);
            in.putExtra("numero2", numero2);
            
            startActivity(in);
        });

        btnMult.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());

            double numero1 = num1;
            double numero2 = num2;
            
            double resultado = num1 * num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(Calculadora3.this, Resultado2.class);
            in.putExtra("resultado", resultString);
            in.putExtra("numero1", numero1);
            in.putExtra("numero2", numero2);
            
            startActivity(in);
        });

        btnDiv.setOnClickListener(view -> {
            num1 = Double.parseDouble(txtNum1.getText().toString());
            num2 = Double.parseDouble(txtNum2.getText().toString());

            double numero1 = num1;
            double numero2 = num2;
            
            double resultado = num1 / num2;
            String resultString = String.valueOf(resultado);

            Intent in = new Intent(Calculadora3.this, Resultado2.class);
            in.putExtra("resultado", resultString);
            in.putExtra("numero1", numero1);
            in.putExtra("numero2", numero2);
            
            startActivity(in);
        });
    }
}