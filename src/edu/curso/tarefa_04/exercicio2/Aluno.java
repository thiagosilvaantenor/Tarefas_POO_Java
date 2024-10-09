package edu.curso.tarefa_04.exercicio2;

import java.time.LocalDate;

public class Aluno {
  private long id;
  private String ra;
  private String nome;
  private LocalDate nascimento;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRa() {
    return this.ra;
  }

  public void setRa(String ra) {
    this.ra = ra;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getNascimento() {
    return this.nascimento;
  }

  public void setNascimento(LocalDate nascimento) {
    this.nascimento = nascimento;
  }

}
