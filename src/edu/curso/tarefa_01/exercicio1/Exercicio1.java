package edu.curso.tarefa_01.exercicio1;

import java.util.Scanner;

public class Exercicio1 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Olá, informe um valor: ");
    double num1 = leitura.nextDouble();
    System.out.println("Agora, informe outro valor: ");
    double num2 = leitura.nextDouble();
    leitura.close();
    double soma = num1 + num2;
    System.out.println(num1 + " + " + num2 + " = " + soma);
  }
}
