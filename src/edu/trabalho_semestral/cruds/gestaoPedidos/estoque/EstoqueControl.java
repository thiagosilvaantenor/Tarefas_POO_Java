package cruds.gestaoPedidos.estoque;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class EstoqueControl {

  private ObservableList<Estoque> lista = FXCollections.observableArrayList();
  private IntegerProperty id = new SimpleIntegerProperty();
  private StringProperty medicamento = new SimpleStringProperty();
  private IntegerProperty quantidade = new SimpleIntegerProperty();
  private StringProperty fornecedor = new SimpleStringProperty();
  private IntegerProperty funcionarioRegistro = new SimpleIntegerProperty();

  private int contador = 0;

  public void entidadeParaTela(Estoque e) {
    this.id.set(e.getId());
    this.medicamento.set(e.getMedicamento());
    this.quantidade.set(e.getQuantidade());
    this.fornecedor.set(e.getFornecedor());
    this.funcionarioRegistro.set(e.getFuncionarioRegistro());
  }

  public void gravar() {
    // se o id da tela for = 0, então é novo registro
    if (id.get() == 0) {
      Estoque e = new Estoque();
      contador += 1;
      // coloca os valores dos campos da tela na entidade
      e.setId(contador);
      e.setMedicamento(this.medicamento.get());
      e.setQuantidade(this.quantidade.get());
      e.setFornecedor(this.fornecedor.get());
      e.setFuncionarioRegistro(this.funcionarioRegistro.get());
      lista.add(e);
    } else {
      // Caso contrario foi selecionado um item já existente para ser atualizado
      for (Estoque e : lista) {
        if (e.getId() == this.id.get()) {
          e.setMedicamento(this.medicamento.get());
          e.setQuantidade(this.quantidade.get());
          e.setFornecedor(this.fornecedor.get());
          e.setFuncionarioRegistro(this.funcionarioRegistro.get());
        }
      }
    }
    System.out.println("Tamanho da Lista: " + lista.size());
  }

  public void limparTudo() {
    id.set(0);
    medicamento.set("");
    quantidade.set(0);
    fornecedor.set("");
    funcionarioRegistro.set(0);
  }

  public void excluir(Estoque e) {
    System.err.println("Excluindo pedido de medicamento com id: " + e.getId());
    lista.remove(e);
  }

  public void pesquisarPorMedicamento() {
    for (Estoque e : lista) {
      if (e.getMedicamento().contains(medicamento.get())) {
        id.set(e.getId());
        medicamento.set(e.getMedicamento());
        quantidade.set(e.getQuantidade());
        fornecedor.set(e.getFornecedor());
        funcionarioRegistro.set(e.getFuncionarioRegistro());
      }
    }
  }

  public ObservableList<Estoque> getLista() {
    return lista;
  }

  public IntegerProperty idProperty() {
    return id;
  }

  public StringProperty medicamentoProperty() {
    return medicamento;
  }

  public IntegerProperty quantidadeProperty() {
    return quantidade;
  }

  public StringProperty fornecedorProperty() {
    return fornecedor;
  }

  public IntegerProperty funcionarioRegistroProperty() {
    return funcionarioRegistro;
  }

}
