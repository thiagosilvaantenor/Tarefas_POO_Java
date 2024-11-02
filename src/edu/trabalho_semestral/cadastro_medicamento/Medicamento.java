package cadastro_medicamento;

import java.time.LocalDate;

public class Medicamento {
  private Long id;
  private String nome;
  private String descricao;
  private String composicao;
  private LocalDate dtFabricacao = LocalDate.now();
  private LocalDate dtValidade;
  private String contraindicacao;
  private Double precoUnidade;

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public String getComposicao() {
    return this.composicao;
  }

  public void setComposicao(String composicao) {
    this.composicao = composicao;
  }

  public LocalDate getDtFabricacao() {
    return this.dtFabricacao;
  }

  public void setDtFabricacao(LocalDate dtFabricacao) {
    this.dtFabricacao = dtFabricacao;
  }

  public LocalDate getDtValidade() {
    return this.dtValidade;
  }

  public void setDtValidade(LocalDate dtValidade) {
    this.dtValidade = dtValidade;
  }

  public String getContraindicacao() {
    return this.contraindicacao;
  }

  public void setContraindicacao(String contraIndicacao) {
    this.contraindicacao = contraIndicacao;
  }

  public Double getPrecoUnidade() {
    return this.precoUnidade;
  }

  public void setPrecoUnidade(Double precoUnidade) {
    this.precoUnidade = precoUnidade;
  }

}
