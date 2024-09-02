package edu.curso.tarefa_02.exercicio2.celular;

public class Celular {
  private String modelo;
  private String marca;
  private Bateria bateria;
  private FoneDeOuvido foneDeOuvido;

  public Celular(String modelo, String marca, Bateria bateria, FoneDeOuvido foneDeOuvido){
    this.modelo = modelo;
    this.marca = marca;
    this.bateria = bateria;
    this.foneDeOuvido = foneDeOuvido;
  }

  public Celular(){
    super();
  }

}
