package edu.curso.tarefa_03.exercicio1.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aluno {
  private long id;
  private String nome;
  private Date nascimento;
  private String ra;

  public Aluno() {
    super();
  }

  public Aluno(long id, String nome, Date nascimento, String ra) {
    this.id = id;
    this.nome = nome;
    this.nascimento = nascimento;
    this.ra = ra;
  }

  // Construtor para caso a data de nascimento vier como String
  public Aluno(long id, String nome, String nascimento, String ra) throws ParseException {
    this.id = id;
    this.nome = nome;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date data = formato.parse(nascimento);
    this.nascimento = data;
    this.ra = ra;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getNascimento() {
    return nascimento;
  }

  public void setNascimento(Date nascimento) {
    this.nascimento = nascimento;
  }

  // Set para Nascimento quando for recebido uma String como data de nascimento
  public void setNascimento(String nascimento) throws ParseException {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date data = formato.parse(nascimento);
    this.nascimento = data;
  }

  public String getRa() {
    return ra;
  }

  public void setRa(String ra) {
    this.ra = ra;
  }

  @Override
  public String toString() {
    return "id: " + this.id + "\n"
        + "Nome: " + this.nome + "\n"
        + "Data nascimento: " + this.nascimento + "\n"
        + "RA: " + this.ra + "\n";
  }
}
