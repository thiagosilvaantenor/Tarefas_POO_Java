package cruds.gestaoPedidos.estoque;

public class Estoque {
  private int id;
  private String medicamento;
  private int quantidade;
  private String fornecedor;
  private int funcionarioRegistro;

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

  public String getMedicamento() {
    return medicamento;
  }

  public void setMedicamento(String medicamento) {
    this.medicamento = medicamento;
  }

}
