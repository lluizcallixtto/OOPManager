package com.example.oopmanager;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.oopmanager.exercises.question_4.Despesa;
import com.example.oopmanager.exercises.question_4.Receita;

import java.util.Date;

public class FinancasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_financas);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView = findViewById(R.id.textViewFinancas);

        Receita receita = new Receita(5000, "Salário", new Date());
        Despesa despesa = new Despesa(1500, "Aluguel", new Date());

        String info = receita.obterDetalhes() + "\n" + despesa.obterDetalhes();

        textView.setText(info);
    }
}