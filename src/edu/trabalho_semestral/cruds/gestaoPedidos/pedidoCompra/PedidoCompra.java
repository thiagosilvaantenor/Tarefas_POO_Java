package cruds.gestaoPedidos.pedidoCompra;

import java.time.LocalDate;

public class PedidoCompra {
  private int id;
  private boolean situacao;
  private LocalDate dataPedido;
  private LocalDate dataEntrega;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public boolean isSituacao() {
    return situacao;
  }

  public void setSituacao(boolean situacao) {
    this.situacao = situacao;
  }

  public LocalDate getDataPedido() {
    return dataPedido;
  }

  public void setDataPedido(LocalDate dataPedido) {
    this.dataPedido = dataPedido;
  }

  public LocalDate getDataEntrega() {
    return dataEntrega;
  }

  public void setDataEntrega(LocalDate dataEntrega) {
    this.dataEntrega = dataEntrega;
  }

}
