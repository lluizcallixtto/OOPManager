package com.example.oopmanager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnVeiculos = findViewById(R.id.btnVeiculos);
        Button btnDispositivos = findViewById(R.id.btnDispositivos);
        Button btnContatos = findViewById(R.id.btnContatos);
        Button btnFinancas = findViewById(R.id.btnFinancas);
        Button btnInvestimentos = findViewById(R.id.btnInvestimentos);

        btnVeiculos.setOnClickListener(v -> startActivity(new Intent(this, VeiculosActivity.class)));
        btnDispositivos.setOnClickListener(v -> startActivity(new Intent(this, DispositivosActivity.class)));
        btnContatos.setOnClickListener(v -> startActivity(new Intent(this, ContatosActivity.class)));
        btnFinancas.setOnClickListener(v -> startActivity(new Intent(this, FinancasActivity.class)));
        btnInvestimentos.setOnClickListener(v -> startActivity(new Intent(this, InvestimentosActivity.class)));
    }
}