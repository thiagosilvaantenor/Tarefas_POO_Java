package edu.curso.tarefa_03.exercicio1.view;

import java.text.ParseException;

import edu.curso.tarefa_03.exercicio1.controller.GestaoAlunos;

public class Menu {
  public static void main(String[] args) {
    GestaoAlunos gestao = new GestaoAlunos();
    try {
      while (true) {
        gestao.menu();
      }
    } catch (ParseException e) {
      System.err.println("Erro, data no formato invalida, tente novamente seguindo o formato: dd/mm/aaaa");
    }
  }
}
