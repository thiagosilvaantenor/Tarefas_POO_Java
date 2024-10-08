package edu.curso.tarefa_04.exercicio1;

import java.util.ArrayList;
import java.util.List;

public class CursoControl {
  private List<Curso> cursos = new ArrayList<>();

  public void gravar(Curso c) {
    cursos.add(c);
  }

  public Curso pesquisar(String parteNome) {
    for (Curso c : cursos) {
      if (c.getNome().toUpperCase().contains(parteNome.toUpperCase())) {
        return c;
      }
    }
    return null;
  }
}
