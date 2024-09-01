package edu.curso.tarefa_01.exercicio5;

public class Televisao {
  private String controle;
  private boolean ligada;
  private String canal;
  private float polegadas;
  private int volume;

  public void ligar() {
    this.ligada = true;
    System.out.println("A televisão foi ligada!");
  }

  public void mudarCanal(String canal) {
    if (ligada) {
      this.canal = canal;
      System.out.println("A televisão está no canal " + canal);
    } else {
      System.out.println("A televisão precisa estar ligada para mudar de canal!");
    }
  }

  public void aumentarVolume(int volume) {
    if (ligada) {
      this.volume += volume;
      System.out.println("O volume do som da televisão aumentou para:  " + this.volume);
    } else {
      System.out.println("A televisão precisa estar ligada para aumentar o volume!");
    }
  }

}
