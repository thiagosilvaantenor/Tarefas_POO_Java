package edu.curso.tarefa_02.exercicio1;

public class Pessoa {
  private String nome;

  public Pessoa(String nome) {
    this.nome = nome;
  }

  public Pessoa() {
    super();
  }

  public void comer() {
      System.out.printf("Pessoa: %s, está comendo",this.nome);
  }

  public void dormir() {
    System.out.printf("Pessoa: %s, está dormindo",this.nome);
  }
}
