package com.example.oopmanager;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.oopmanager.exercises.question_2.Computador;
import com.example.oopmanager.exercises.question_2.Smartphone;

public class DispositivosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_dispositivos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView = findViewById(R.id.textViewDispositivos);

        Computador pc = new Computador("Dell", 16, "912", "Intel i7" );
        Smartphone smartphone = new Smartphone("Samsung", 22,"258", false);

        String info = "Computador: " + pc.obterDetalhes() + "\n" +
                      "Samsung: " + smartphone.obterDetalhes();

        textView.setText(info);
    }
}