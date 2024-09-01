package edu.curso.tarefa_01.exercicio7;

public class Caixa {
  private double saldo;

  public double venda(double valorProduto){
    this.saldo += valorProduto;
    return this.saldo;
  }
}
