package edu.curso.tarefa_04.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Aluno {
  private long id;
  private String ra;
  private String nome;
  private Date nascimento;

  public long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getRa() {
    return this.ra;
  }

  public void setRa(String ra) {
    this.ra = ra;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Date getNascimento() {
    return this.nascimento;
  }

  public void setNascimento(String nascimento) throws ParseException {
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
    Date data = formatador.parse(nascimento);
    this.nascimento = data;
  }

}
