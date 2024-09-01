package edu.curso.tarefa_01.exercicio8;

public class CaixaVarArgs {
  /*Com base no exercício anterior o seu cliente pediu para que as vendas possam receber diversos produtos simultaneamente.
  Faça a modificação no método venda de maneira que possa somar os valores de diversos produtos de uma única vez.*/
  private double saldo;

  public double venda(double ...valorProduto){
    for (double d : valorProduto) {
      this.saldo += d;
    }
    return this.saldo;
  }
}
