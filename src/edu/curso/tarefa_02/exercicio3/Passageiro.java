package edu.curso.tarefa_02.exercicio3;

public class Passageiro extends Pessoa {
  private int numPassaporte;
  private String destino;
  private String classe;

  public Passageiro(int numPassaporte, String destino, String classe) {
    this.numPassaporte = numPassaporte;
    this.destino = destino;
    this.classe = classe;
  }

  public void embarcarNaAeronave() {
    System.out.printf(
        "Passageiro: %s, está embarcando na aeronave com destino %s, na classe %s. %n",
        super.getNome(), this.destino, this.classe);
  }
}
