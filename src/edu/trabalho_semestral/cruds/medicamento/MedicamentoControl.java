package cruds.medicamento;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MedicamentoControl {

  private ObservableList<Medicamento> lista = FXCollections.observableArrayList();
  private IntegerProperty id = new SimpleIntegerProperty(0);
  private StringProperty nome = new SimpleStringProperty("");
  private IntegerProperty pacienteId = new SimpleIntegerProperty(0);
  private ObjectProperty<LocalDate> dataReceita = new SimpleObjectProperty<>(LocalDate.now());
  private StringProperty medicoCRM = new SimpleStringProperty("");

  private int contador = 0;

  public void entidadeParaTela(Medicamento r) {
    this.id.set(r.getId());
    this.pacienteId.set(r.getPacienteId());
    this.dataReceita.set(r.getDataReceita());
    this.medicoCRM.set(r.getMedicoCRM());
  }

  public void excluir(Medicamento m) {
    System.out.println("Excluindo medicamento com o nome: " + m.getNome());
    lista.remove(m);
  }

  public void gravar() {
    // id = 0 sempre que for um novo registro
    if (id.get() == 0) {
      Medicamento m = new Medicamento();
      contador += 1;
      // muda o valor do id para estar de acordo com o contador
      m.setId(contador);
      m.setNome(this.nome.get());
      m.setPacienteId(this.pacienteId.get());
      m.setDataReceita(this.dataReceita.get());
      m.setMedicoCRM(this.medicoCRM.get());
      lista.add(m);
    } else {
      for (Medicamento m : lista) {
        if (m.getId() == this.id.get()) {
          m.setNome(this.nome.get());
          m.setPacienteId(this.pacienteId.get());
          m.setDataReceita(this.dataReceita.get());
          m.setMedicoCRM(this.medicoCRM.get());
        }
      }
    }
    System.out.println("Lista tamanho: " + lista.size());
  }

  public void limparTudo() {
    id.set(0);
    nome.set("");
    pacienteId.set(0);
    dataReceita.set(LocalDate.now());
    medicoCRM.set("");
  }

  public void pesquisarPorNome() {
    for (Medicamento m : lista) {
      if (m.getNome().contains(nome.get())) {
        nome.set(m.getNome());
        pacienteId.set(m.getPacienteId());
        dataReceita.set(m.getDataReceita());
        medicoCRM.set(m.getMedicoCRM());
      }
    }
  }

  public ObservableList<Medicamento> getLista() {
    return lista;
  }

  public IntegerProperty idProperty() {
    return this.id;
  }

  public StringProperty nomeProperty() {
    return nome;
  }

  public IntegerProperty pacienteIdProperty() {
    return pacienteId;
  }

  public ObjectProperty<LocalDate> dataReceitaProperty() {
    return dataReceita;
  }

  public StringProperty medicoCRMProperty() {
    return medicoCRM;
  }
}
