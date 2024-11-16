package cruds.medicamento;

import java.time.LocalDate;

public class Medicamento {
  private int id;
  private String nome;
  private LocalDate dataReceita;
  private int pacienteId;
  private String medicoCRM;

  public int getId() {
    return id;
  }

  public int getPacienteId() {
    return pacienteId;
  }

  public void setPacienteId(int pacienteId) {
    this.pacienteId = pacienteId;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataReceita() {
    return dataReceita;
  }

  public void setDataReceita(LocalDate dataReceita) {
    this.dataReceita = dataReceita;
  }

  public String getMedicoCRM() {
    return medicoCRM;
  }

  public void setMedicoCRM(String medicoCRM) {
    this.medicoCRM = medicoCRM;
  }

}
