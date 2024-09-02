package edu.curso.tarefa_02.exercicio3;

import java.util.ArrayList;
import java.util.List;

public class Aeroporto {
  private int qntAeronaves;
  private int qntPistas;
  private String endereco;
  private List<Aeronave> aeronaves = new ArrayList<>();

  public Aeroporto() {
    super();
  }

  public Aeroporto(int qntAeronaves, int qntPistas, String endereco, List<Aeronave> aeronaves) {
    this.qntAeronaves = qntAeronaves;
    this.qntPistas = qntPistas;
    this.endereco = endereco;
    this.aeronaves = aeronaves;
  }

  public void informarAtrasoEmViagem() {
    System.out.println("ATENÇÃO PASSAGEIROS! Devido a problemas climaticos havera atraso na viagem #11");
  }
}
