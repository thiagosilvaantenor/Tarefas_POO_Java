package edu.curso.tarefa_01.exercicio6;

public class Exercicio6 {

  public static void main(String[] args) {
    Computador obj1 = new Computador();
    obj1.ligar();
    obj1.abrirNavegador();
    Videogame obj2 = new Videogame();
    obj2.ligar("Playstation 5");
    obj2.baixarJogo("God of War");
  }

}
