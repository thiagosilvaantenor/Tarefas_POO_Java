package cruds.gestaoPedidos;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PedidoMedicamentoControl {

  private ObservableList<PedidoMedicamento> lista = FXCollections.observableArrayList();
  private IntegerProperty id = new SimpleIntegerProperty();
  private IntegerProperty quantidade = new SimpleIntegerProperty();
  private StringProperty fornecedor = new SimpleStringProperty();
  private IntegerProperty funcionarioRegistro = new SimpleIntegerProperty();
  private IntegerProperty idMedicamento = new SimpleIntegerProperty();

  private int contador = 0;

  public void entidadeParaTela(PedidoMedicamento p) {
    this.id.set(p.getId());
    this.quantidade.set(p.getQuantidade());
    this.fornecedor.set(p.getFornecedor());
    this.funcionarioRegistro.set(p.getFuncionarioRegistro());
    this.idMedicamento.set(p.getIdMedicamento());
  }

  public void gravar() {
    // se o id da tela for = 0, então é novo registro
    if (id.get() == 0) {
      PedidoMedicamento p = new PedidoMedicamento();
      contador += 1;
      // coloca os valores dos campos da tela na entidade
      p.setId(contador);
      p.setQuantidade(this.quantidade.get());
      p.setFornecedor(this.fornecedor.get());
      p.setFuncionarioRegistro(this.funcionarioRegistro.get());
      p.setIdMedicamento(this.idMedicamento.get());
      lista.add(p);
    } else {
      // Caso contrario foi selecionado um item já existente para ser atualizado
      for (PedidoMedicamento p : lista) {
        if (p.getId() == this.id.get()) {
          p.setQuantidade(this.quantidade.get());
          p.setFornecedor(this.fornecedor.get());
          p.setFuncionarioRegistro(this.funcionarioRegistro.get());
          p.setIdMedicamento(this.idMedicamento.get());
        }
      }
    }
    System.out.println("Tamanho da Lista: " + lista.size());
  }

  public void limparTudo() {
    id.set(0);
    quantidade.set(0);
    fornecedor.set("");
    funcionarioRegistro.set(0);
    idMedicamento.set(0);
  }

  public void excluir(PedidoMedicamento p) {
    System.err.println("Excluindo pedido de medicamento com id: " + p.getId());
    lista.remove(p);
  }

  public void pesquisarPorIdMedicamento() {
    for (PedidoMedicamento p : lista) {
      if (p.getIdMedicamento() == idMedicamento.get()) {
        quantidade.set(p.getQuantidade());
        fornecedor.set(p.getFornecedor());
        funcionarioRegistro.set(p.getFuncionarioRegistro());
        idMedicamento.set(p.getIdMedicamento());
      }
    }
  }

  public ObservableList<PedidoMedicamento> getLista() {
    return lista;
  }

  public IntegerProperty idProperty() {
    return id;
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

  public IntegerProperty idMedicamentoProperty() {
    return idMedicamento;
  }

}
