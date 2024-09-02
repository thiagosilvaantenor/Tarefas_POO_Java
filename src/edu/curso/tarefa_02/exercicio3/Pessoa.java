package edu.curso.tarefa_02.exercicio3;

import java.time.LocalDate;

public class Pessoa {
  private String nome;
  private String nacionalidade;
  private LocalDate dataNascimento;

  public Pessoa() {
    super();
  }

  public Pessoa(String nome, String nacionalidade, LocalDate dataNascimento) {
    this.nome = nome;
    this.nacionalidade = nacionalidade;
    this.dataNascimento = dataNascimento;
  }

  public String getNome() {
    return nome;
  }

  public String getNacionalidade() {
    return nacionalidade;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void apresentar() {
    System.out.printf("Olá, me chamo %s, minha nacionalidade é %s.%n", this.nome, this.nacionalidade);
  }
}
