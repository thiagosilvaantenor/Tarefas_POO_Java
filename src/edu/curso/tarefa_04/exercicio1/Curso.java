package edu.curso.tarefa_04.exercicio1;

public class Curso {
  private long id;
  private String nome;
  private int codigo;
  private String nomeCoordenador;
  private int qntAlunos;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getCodigo() {
    return this.codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNomeCoordenador() {
    return this.nomeCoordenador;
  }

  public void setNomeCoordenador(String nomeCoordenador) {
    this.nomeCoordenador = nomeCoordenador;
  }

  public int getQntAlunos() {
    return this.qntAlunos;
  }

  public void setQntAlunos(int qntAlunos) {
    this.qntAlunos = qntAlunos;
  }

}
