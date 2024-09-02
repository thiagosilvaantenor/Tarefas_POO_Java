package edu.curso.tarefa_02.exercicio3;

import java.time.LocalTime;

public class Piloto extends Pessoa {
  private int numHabilitacao;
  private LocalTime HorarioInicioTrabalho;
  private LocalTime HorarioFimTrabalho;

  public Piloto(int numHabilitacao, LocalTime horarioInicioTrabalho, LocalTime horarioFimTrabalho) {
    this.numHabilitacao = numHabilitacao;
    HorarioInicioTrabalho = horarioInicioTrabalho;
    HorarioFimTrabalho = horarioFimTrabalho;
  }

  public void pilotarAeronave() {
    System.out.printf("Piloto: %s, está pilotando a aeronave", super.getNome());
  }
}
