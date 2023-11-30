package com.example.presencify.home;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.presencify.R;
import com.example.presencify.form.Formulario;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        FloatingActionButton btnToForm = findViewById(R.id.buttonToForm);

        btnToForm.setOnClickListener(v -> {
            Intent it = new Intent(Home.this, Formulario.class);

            startActivity(it);
        });

    }
}