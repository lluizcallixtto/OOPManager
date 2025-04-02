package com.example.oopmanager;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.oopmanager.exercises.question_5.Acao;
import com.example.oopmanager.exercises.question_5.FundoImobiliario;
import com.example.oopmanager.exercises.question_5.GerenciadorInvestimentos;

import java.util.Date;

public class InvestimentosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_investimentos);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        TextView textView = findViewById(R.id.textViewInvestimentos);

        Acao acao1 = new Acao(100,"PETR4", new Date(), 37.50) {
            @Override
            public double calculadoraRetorno() {
                return 0;
            }

            @Override
            public Date data() {
                return null;
            }

            @Override
            public Date getDate() {
                return null;
            }
        };
        Acao acao2 = new Acao(50, "VALE3", new Date(), 75.80) {
            @Override
            public double calculadoraRetorno() {
                return 0;
            }

            @Override
            public Date data() {
                return null;
            }

            @Override
            public Date getDate() {
                return null;
            }
        };

        FundoImobiliario fundo1 = new FundoImobiliario(10, "HGLG11", new Date(), 160.00) {
            @Override
            public double calculadoraRetorno() {
                return 0;
            }

            @Override
            public Date data() {
                return null;
            }

            @Override
            public Date getDate() {
                return null;
            }
        };

        GerenciadorInvestimentos gerenciador = new GerenciadorInvestimentos();
        gerenciador.adicionarTransacoes(acao1);
        gerenciador.adicionarTransacoes(acao2);
        gerenciador.adicionarTransacoes(fundo1);

        double retornoTotal = gerenciador.calcularRetornoTotal();

        String info = "Investimentos: \n" +
                        acao1.getDescricao() + "\n" +
                        acao2.getDescricao() + "\n" +
                        fundo1.getDescricao() + "\n" +
                        "Retorno Total: R$ " + retornoTotal;

        textView.setText(info);
    }
}