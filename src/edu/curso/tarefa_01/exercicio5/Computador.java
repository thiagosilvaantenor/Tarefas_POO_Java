package edu.curso.tarefa_01.exercicio5;

public class Computador {

  private boolean monitor;
  private String mouse;
  private String teclado;
  private String processador;
  private String placaDeVideo;

  public void ligar() {
    System.out.println("Ligando ...");
    this.monitor = true;
  }

  public void desligar() {
    System.out.println("Desligando ...");
    this.monitor = false;
  }

  public void abrirNavegador() {
    if (monitor == true)
      System.out.println("Abrindo navegador ...");
    else
      System.out.println("Computador está desligado, é necessário ligar ele primeiro");
  }

}
