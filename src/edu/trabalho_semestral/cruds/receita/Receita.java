package cruds.receita;

import java.time.LocalDate;

public class Receita {
  private int id;
  private LocalDate dataReceita;
  private int pacienteId;
  private String medicoCRM;
  //receita vai ter uma lista de medicamentos

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
