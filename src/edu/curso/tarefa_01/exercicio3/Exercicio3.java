package edu.curso.tarefa_01.exercicio3;

public class Exercicio3 {
  final static int tamanho = 5;

  public static class BombaHeap {
    // Classe estatica feita para explodir a memoria Heap
    private long[] e = new long[50];
    private long[] x = new long[500];
    private long[] p = new long[5000];
    private long[] l = new long[50000];
    private long[] o = new long[500000];
    private long[] d = new long[5000000];
    private long[] i = new long[50000000];
    private long[] u = new long[50000000];
  }

  public static void main(String[] args) {
    // Explosão da Memoria Heap
    BombaHeap[] bombaHeap = new BombaHeap[tamanho];
    for (int i = 0; i < tamanho; i++) {
      if (i == 2)
        System.out.println("EXPLODIU!");
      else
        System.out.println("OLHA A BOMBA!");

      bombaHeap[i] = new BombaHeap();
    }
  }

}
