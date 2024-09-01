package edu.curso.tarefa_01.exercicio6;

public class Videogame {
  public String marca;
  public String nome;
  private int qntMemoriaGB = 800;
  private String[] jogos = new String[10];
  private String tempoGarantia = "1 Ano";

  public void ligar(String nome) {
    this.nome = nome;
    System.out.println("Ligando " + nome);
  }

  public void baixarJogo(String nomeJogo) {
    for (int i = 0; i < jogos.length; i++) {
      if (jogos[i] == null) {
        jogos[i] = nomeJogo;
        this.qntMemoriaGB -= 100;
        break;
      }
    }
  }

  public void desinstalarJogo(String nomeJogo) {
    boolean achou = false;
    for (int i = 0; i < jogos.length; i++) {
      if (jogos[i] == nomeJogo) {
        jogos[i] = null;
        this.qntMemoriaGB += 100;
        achou = true;
        break;
      }
    }
    if (!achou) {
      System.out.println("Jogo não encontrado!");
    }
  }

}
