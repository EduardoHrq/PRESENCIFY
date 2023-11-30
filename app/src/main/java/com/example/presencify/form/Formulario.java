package com.example.presencify.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.presencify.R;
import com.example.presencify.home.Home;

public class Formulario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        Button btnProximo1 = (Button) findViewById(R.id.buttonProx1);

        Button btnProximo2 = (Button) findViewById(R.id.buttonProx2);

        Button btnVoltar1 = (Button) findViewById(R.id.voltar1);

        Button btnVoltar2 = (Button) findViewById(R.id.voltar2);

        Button btnEnviar = (Button) findViewById(R.id.enviarForm);

        LinearLayout form1 = findViewById(R.id.form1);

        LinearLayout form2 = findViewById(R.id.form2);

        LinearLayout form3 = findViewById(R.id.form3);

        btnProximo1.setOnClickListener(v -> {
            System.out.println("OK");
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) form1.getLayoutParams();
            params.weight = 1;
            form1.setLayoutParams(params);
        });

        btnProximo2.setOnClickListener(v -> {
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) form2.getLayoutParams();
            params.weight = 1;
            form2.setLayoutParams(params);
        });

        btnVoltar1.setOnClickListener(v -> {
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) form1.getLayoutParams();
            params.weight = 0;
            form1.setLayoutParams(params);
        });

        btnVoltar2.setOnClickListener(v -> {
            LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) form2.getLayoutParams();
            params.weight = 0;
            form2.setLayoutParams(params);
        });

        btnEnviar.setOnClickListener(v -> {

            Intent it = new Intent(Formulario.this, Home.class);

            startActivity(it);

            finish();

        });
    }
}