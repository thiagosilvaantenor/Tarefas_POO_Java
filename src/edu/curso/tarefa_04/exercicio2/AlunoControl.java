package edu.curso.tarefa_04.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class AlunoControl {
  private List<Aluno> alunos = new ArrayList<>();

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
