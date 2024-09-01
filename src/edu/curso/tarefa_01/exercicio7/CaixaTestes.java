package edu.curso.tarefa_01.exercicio7;

public class CaixaTestes {
  public static void main(String[] args) {
    Caixa caixa = new Caixa();
    double valorProduto = 50;
    System.out.println("Valor do saldo após adicionado o valor do produto: " + caixa.venda(valorProduto));
  }

}
