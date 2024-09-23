package edu.curso.tarefa_03.exercicio2.view;

import java.text.ParseException;

import edu.curso.tarefa_03.exercicio2.controller.GestaoFuncionario;

public class CrudFuncionario {
  public static void main(String[] args) {
    GestaoFuncionario gestao = new GestaoFuncionario();
    try {
      while (true) {
        gestao.menu();
      }
    } catch (ParseException e) {
      System.err.println("Erro, data no formato invalida, tente novamente seguindo o formato: dd/mm/aaaa");
    }
  }
}
