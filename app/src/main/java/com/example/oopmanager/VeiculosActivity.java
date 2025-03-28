package com.example.oopmanager;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.oopmanager.exercises.question_1.Carro;
import com.example.oopmanager.exercises.question_1.Moto;

public class VeiculosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_veiculos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView = findViewById(R.id.textViewVeiculos);

        Carro carro = new Carro("Toyota", "Corolla", 2017, 4);
        Moto moto = new Moto("Honda", "CB 500",2022, false);

        String info = "Carro: " + carro.obterDetalhes() + "\n" +
                      "Moto: " + moto.obterDetalhes();

        textView.setText(info);
    }
}