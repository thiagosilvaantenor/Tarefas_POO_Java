package edu.curso.tarefa_01.exercicio8;

public class CaixaVarArgsTestes {
  public static void main(String[] args) {
    CaixaVarArgs caixa = new CaixaVarArgs();
    double[] valorProduto = {50, 100, 200, 25.5};
    System.out.println("Valor do saldo após adicionado o valor do produto: " + caixa.venda(valorProduto));
  }

}
