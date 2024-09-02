package edu.curso.tarefa_02.exercicio2.guarda_roupa;

import java.util.ArrayList;
import java.util.List;

public class GuardaRoupa {
  private int qntPorta = 1;
  private double altura;
  private double largura;
  private List<Roupa> roupas;
  private Porta[] portas = new Porta[qntPorta];

  public GuardaRoupa(int qntPorta, double altura, double largura, List<Roupa> roupas,
      Porta[] portas) {
    this.qntPorta = qntPorta;
    this.altura = altura;
    this.largura = largura;
    this.roupas = roupas;
    this.portas = portas;
  }

  public GuardaRoupa() {
    super();
  }

}
