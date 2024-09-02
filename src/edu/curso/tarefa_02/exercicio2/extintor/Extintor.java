package edu.curso.tarefa_02.exercicio2.extintor;

public class Extintor {
  private String tipo;
  private AgenteExtintor agenteExtintor;
  private SuporteDeParede suporteDeParede;

  public Extintor(String tipo, AgenteExtintor agenteExtintor, SuporteDeParede suporteDeParede) {
    this.tipo = tipo;
    this.agenteExtintor = agenteExtintor;
    this.suporteDeParede = suporteDeParede;
  }

  public Extintor() {
    super();
  }
}
