package com.example.oopmanager.exercises.question_4;

import java.util.Date;

public interface ITransacao {
  double getValor();
  String getDescricao();
  Date getData();
  String getTipo();
  String obterDetalhes();

}
