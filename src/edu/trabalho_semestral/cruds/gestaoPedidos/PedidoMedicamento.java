package cruds.gestaoPedidos;

public class PedidoMedicamento {
  private int id;
  private int quantidade;
  private String fornecedor;
  private int funcionarioRegistro;
  private int idMedicamento;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public String getFornecedor() {
    return fornecedor;
  }

  public void setFornecedor(String fornecedor) {
    this.fornecedor = fornecedor;
  }

  public int getFuncionarioRegistro() {
    return funcionarioRegistro;
  }

  public void setFuncionarioRegistro(int funcionarioRegistro) {
    this.funcionarioRegistro = funcionarioRegistro;
  }

  public int getIdMedicamento() {
    return idMedicamento;
  }

  public void setIdMedicamento(int idMedicamento) {
    this.idMedicamento = idMedicamento;
  }

}
