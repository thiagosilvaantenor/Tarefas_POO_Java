package edu.curso.tarefa_02.exercicio4;

public class Dinossauro {
  private int energia = 5;
  private int velocidade = 5;
  private int temperatura = 35;
  private String humor = "Triste";

  public int getEnergia() {
    return energia;
  }

  public int getVelocidade() {
    return velocidade;
  }

  public int getTemperatura() {
    return temperatura;
  }

  public String getHumor() {
    return humor;
  }

  public void pular() {
    this.energia--;
    this.humor = "Feliz";
    System.out.printf("O Dinosaurro pulou.%n Energia diminui: %d e humor mudou: %s. %n", getEnergia(), getHumor());
  }

  public void correr() {
    this.energia--;
    this.velocidade--;
    this.humor = "Feliz";
    System.out.printf("O Dinosaurro correu.%n Energia diminui: %d, velocidade diminui: %d e humor mudou: %s. %n",
        getEnergia(), getVelocidade(), getHumor());
  }

  public void comer() {
    this.energia++;
    this.velocidade--;
    this.humor = "Feliz";
    System.out.printf("O Dinosaurro comeu.%n Energia aumentou: %d, velocidade diminui: %d e humor mudou: %s. %n",
        getEnergia(), getVelocidade(), getHumor());
  }

  public void cantar() {
    this.energia--;
    this.humor = "Feliz";

    System.out.printf("O Dinosaurro está cantando.%n Energia diminui: %d, e humor mudou: %s. %n",
        getEnergia(), getHumor());
  }

  public void tomarSol() {
    this.velocidade++;
    this.temperatura++;
    this.humor = "Feliz";
    System.out.printf(
        "O Dinosaurro está tomando sol.%n Energia diminui: %d, velocidade aumentou: %d, temperatura aumentou: %d e humor mudou: %s. %n",
        getVelocidade(), getTemperatura(), getHumor());
  }

  public void ficarNaSombra() {
    this.energia++;
    this.temperatura--;
    this.humor = "Triste";
    System.out.printf(
        "O Dinosaurro ficou na sombra.%n Energia aumentou: %d,temperatura diminuiu: %d e humor mudou: %s.%n",
        getEnergia(), getTemperatura(), getHumor());
  }

  @Override
  public String toString() {
    return ("O skeep tem os seguintes atributos:\n"
        + "Energia: " + getEnergia()
        + "\nVelocidade: " + getVelocidade()
        + "\nTemperatura: " + getTemperatura()
        + "\nHumor: " + getHumor()+ "\n");
  }
}
