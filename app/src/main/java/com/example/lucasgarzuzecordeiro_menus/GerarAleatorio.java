package com.example.lucasgarzuzecordeiro_menus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class GerarAleatorio extends AppCompatActivity {

    Button btnGerar;
    TextView txtNumber1, txtNumber2, txtNumber3, txtNumber4, txtNumber5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gerar_aleatorio);

        btnGerar = findViewById(R.id.btnGerar);
        txtNumber1 = findViewById(R.id.txtNumber1);
        txtNumber2 = findViewById(R.id.txtNumber2);
        txtNumber3 = findViewById(R.id.txtNumber3);
        txtNumber4 = findViewById(R.id.txtNumber4);
        txtNumber5 = findViewById(R.id.txtNumber5);

        btnGerar.setOnClickListener(view -> {
            Random rand = new Random();
            int numero1 = rand.nextInt(1000);
            txtNumber1.setText(String.valueOf(numero1));

            int numero2 = rand.nextInt(1000);
            txtNumber2.setText(String.valueOf(numero2));

            int numero3 = rand.nextInt(1000);
            txtNumber3.setText(String.valueOf(numero3));

            int numero4 = rand.nextInt(1000);
            txtNumber4.setText(String.valueOf(numero4));

            int numero5 = rand.nextInt(1000);
            txtNumber5.setText(String.valueOf(numero5));
        });
    }
}