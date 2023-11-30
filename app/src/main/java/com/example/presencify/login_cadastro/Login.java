package com.example.presencify.login_cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.presencify.R;
import com.example.presencify.R.id;
import com.example.presencify.home.Home;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView cadastro = (TextView) findViewById(R.id.linkCadastro);

        cadastro.setOnClickListener(v -> {
            Intent it = new Intent(Login.this, Cadastro.class);

            startActivity(it);

        });

        Button btnToHome = (Button) findViewById(R.id.buttonToHome);

        btnToHome.setOnClickListener(v -> {
            Intent it = new Intent(Login.this, Home.class);

            startActivity(it);

            finish();
        });
    }
}