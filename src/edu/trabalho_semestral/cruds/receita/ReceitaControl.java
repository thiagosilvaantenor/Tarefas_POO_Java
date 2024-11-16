package cruds.receita;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ReceitaControl {

  private ObservableList<Receita> lista = FXCollections.observableArrayList();
  private IntegerProperty id = new SimpleIntegerProperty(0);
  private IntegerProperty pacienteId = new SimpleIntegerProperty(0);
  private ObjectProperty<LocalDate> dataReceita = new SimpleObjectProperty<>(LocalDate.now());
  private StringProperty medicoCRM = new SimpleStringProperty("");

  private int contador = 0;

  public void entidadeParaTela(Receita r) {
    this.id.set(r.getId());
    this.pacienteId.set(r.getPacienteId());
    this.dataReceita.set(r.getDataReceita());
    this.medicoCRM.set(r.getMedicoCRM());
  }

  public void excluir(Receita r) {
    System.out.println("Excluindo a receita de id: " + r.getId());
    lista.remove(r);
  }

  public void gravar() {
    // id = 0 sempre que for um novo registro
    if (id.get() == 0) {
      Receita r = new Receita();
      contador += 1;
      // muda o valor do id para estar de acordo com o contador
      r.setId(contador);
      r.setPacienteId(this.pacienteId.get());
      r.setDataReceita(this.dataReceita.get());
      r.setMedicoCRM(this.medicoCRM.get());
      lista.add(r);
    } else {
      for (Receita m : lista) {
        if (m.getId() == this.id.get()) {
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
    pacienteId.set(0);
    dataReceita.set(LocalDate.now());
    medicoCRM.set("");
  }

  public void pesquisarPorData() {
    for (Receita m : lista) {
      if (m.getDataReceita().equals(dataReceita.get())) {
        pacienteId.set(m.getPacienteId());
        dataReceita.set(m.getDataReceita());
        medicoCRM.set(m.getMedicoCRM());
      }
    }
  }

  public ObservableList<Receita> getLista() {
    return lista;
  }

  public IntegerProperty idProperty() {
    return this.id;
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
