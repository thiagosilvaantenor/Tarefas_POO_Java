package edu.curso.tarefa_03.exercicio3.nobreza;

public class Rainha extends Nobre implements Diplomata{

  @Override
  public void fazerDiplomacia() {
    System.out.println("A rainha está negociando um tratado de paz entre o Principe e o Conde");
  }

}
