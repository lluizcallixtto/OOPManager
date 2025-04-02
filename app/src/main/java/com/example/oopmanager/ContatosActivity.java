package com.example.oopmanager;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.oopmanager.exercises.question_3.ContatoPessoal;
import com.example.oopmanager.exercises.question_3.ContatoProfissional;

public class ContatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_contatos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView = findViewById(R.id.textViewContatos);

        ContatoPessoal contato1 = new ContatoPessoal("Luiz", "(81) 9 9561-1521", "leac.calixto@gmail.com", "Dudu");
        ContatoProfissional contato2 = new ContatoProfissional("Luiz", "(81) 9 9561-1521","leac.calixto@gmail.com","Meta");

        String info = contato1.obterDetalhes() + "\n" + contato2.obterDetalhes();

        textView.setText(info);
    }
}