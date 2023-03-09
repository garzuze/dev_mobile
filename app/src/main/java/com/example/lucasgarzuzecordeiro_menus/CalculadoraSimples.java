package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraSimples extends AppCompatActivity {
Button btnCalcular;
TextView txtVisorCalculadoraSimples;
Double num1, num2, num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_simples);

        btnCalcular=findViewById(R.id.btnCalcular);
        txtVisorCalculadoraSimples=findViewById(R.id.txtVisorCalculadoraSimples);
        btnCalcular.setOnClickListener((View.OnClickListener) view -> {
            num1 = Double.parseDouble(txtVisorCalculadoraSimples.getText().toString());
            txtVisorCalculadoraSimples.setText("");
        });

    }
}