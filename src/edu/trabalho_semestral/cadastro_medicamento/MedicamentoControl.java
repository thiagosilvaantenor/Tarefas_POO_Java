package cadastro_medicamento;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MedicamentoControl {
  private ObservableList<Medicamento> listaMedicamento = FXCollections.observableArrayList();
  private long id = 0;
  private StringProperty nome = new SimpleStringProperty();
  private StringProperty descricao = new SimpleStringProperty();
  private StringProperty composicao = new SimpleStringProperty();
  private ObjectProperty<LocalDate> dtFabricacao = new SimpleObjectProperty<>();
  private ObjectProperty<LocalDate> dtValidade = new SimpleObjectProperty<>();
  private StringProperty contraindicacao = new SimpleStringProperty();
  private DoubleProperty precoUnidade = new SimpleDoubleProperty();

  public void adicionar() {
    Medicamento m = new Medicamento();
    id += 1;
    m.setId(id);
    m.setNome(this.nome.get());
    m.setDescricao(this.descricao.get());
    m.setComposicao(this.composicao.get());
    m.setDtFabricacao(this.dtFabricacao.get());
    m.setDtValidade(this.dtValidade.get());
    m.setContraindicacao(this.contraindicacao.get());
    m.setPrecoUnidade(this.precoUnidade.get());
    
    listaMedicamento.add(m);
    
  }

  public void pesquisarPorNome() {
    for (Medicamento m : listaMedicamento) {
      if (m.getNome().toUpperCase().contains(this.nome.get().toUpperCase())) {
        this.nome.set(m.getNome());
        this.descricao.set(m.getDescricao());
        this.composicao.set(m.getComposicao());
        this.dtFabricacao.set(m.getDtFabricacao());
        this.dtValidade.set(m.getDtValidade());
        this.contraindicacao.set(m.getContraindicacao());
        this.precoUnidade.set(m.getPrecoUnidade());
      }
    }
  }

  public ObservableList<Medicamento> getListaMedicamento() {
    return listaMedicamento;
  }

  public StringProperty nomeProperty() {
    return nome;
  }

  public StringProperty descricaoProperty() {
    return descricao;
  }

  public StringProperty composicaoProperty() {
    return composicao;
  }

  public ObjectProperty<LocalDate> dtFabricacaoProperty() {
    return dtFabricacao;
  }

  public ObjectProperty<LocalDate> dtValidadeProperty() {
    return dtValidade;
  }

  public StringProperty contraindicacaoProperty() {
    return contraindicacao;
  }

  public DoubleProperty precoUnidadeProperty() {
    return precoUnidade;
  }

}
