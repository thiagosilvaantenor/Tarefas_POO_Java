package edu.curso.tarefa_04.exercicio2;

import java.util.ArrayList;

public class AlunoControl {
  private ArrayList<Aluno> alunos = new ArrayList<>();

  public void adicionar(Aluno a) {
    if (a != null) {
      alunos.add(a);
    }
  }

  public Aluno pesquisarPorNome(String nome) {
    for (Aluno a : alunos) {
      if (a.getNome().toUpperCase().contains(nome.toUpperCase())) {
          return a;
      }
    }
    return null;
  }

}
