package edu.curso.tarefa_02.exercicio3;

public class Aeronave {
  private int qntAcentos;
  private double velocidadeMaxKm;
  private String modelo;
  private Passageiro[] passageiro = new Passageiro[qntAcentos];
  private Piloto piloto;

  public Aeronave(int qntAcentos, double velocidadeMax, String modelo, Piloto piloto) {
    this.qntAcentos = qntAcentos;
    this.velocidadeMaxKm = velocidadeMax;
    this.modelo = modelo;
    this.piloto = piloto;
  }

  public void setPassageiro(Passageiro passageiro) {
    for (Passageiro p : this.passageiro) {
      if (p == null) {
        p = passageiro;
        break;
      }
    }
  }

  public void usarTremDePouso() {
    System.out.println("Escotilha de trem de pouso sendo aberto...\nTrem de pouso sendo usado...");
  }

}
