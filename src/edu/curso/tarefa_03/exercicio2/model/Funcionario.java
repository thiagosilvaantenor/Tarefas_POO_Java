package edu.curso.tarefa_03.exercicio2.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
  private long id;
  private String nome;
  private String matricula;
  private Date admissao;
  private Date demissao;
  private Float salario;
  private String horario;

  public Funcionario(long id, String nome, String matricula, String admissao, String demissao, Float salario,
      String horario) throws ParseException {
    this.id = id;
    this.nome = nome;
    this.matricula = matricula;
    setAdmissao(admissao);
    setDemissao(demissao);
    this.salario = salario;
    this.horario = horario;
  }

  private String tratamentoDateToString(Date data) {
    // Transforma a data em String com o método toString
    String dataFormatada = data.toString();
    // o retorno do método acima segue o padrão:
    // [Dia por extenso, Mês abreviado, dia, hora:minutos:segundos, fuso, horario
    // ano]

    // Separa cada elemento acima pelos espaços
    String[] vetorData = dataFormatada.split(" ");

    // Como sempre seguira um padrão, basta buscar com os indices cada elemento para
    // formar o padrão: Dia/Mes/Ano
    dataFormatada = vetorData[2] + "/" + vetorData[1] + "/" + vetorData[5];
    return dataFormatada;
  }

  public void exibir() {
    String dataAd = tratamentoDateToString(getAdmissao());
    String dataDe = tratamentoDateToString(getDemissao());
    System.out.printf(
        "%nId: %d"
            + "%nNome: %s"
            + "%nMatricula: %s"
            + "%nAdmissao: %s"
            + "%nDemissao: %s"
            + "%nSalario: %f"
            + "%nHorario: %s%n",
        getId(), getNome(), getMatricula(), dataAd, dataDe, getSalario(), getHorario());
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

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public Date getAdmissao() {
    return admissao;
  }

  public void setAdmissao(Date admissao) {
    this.admissao = admissao;
  }

  // Set para Nascimento quando for recebido uma String como data de nascimento
  public void setAdmissao(String admissao) throws ParseException {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date data = formato.parse(admissao);
    this.admissao = data;
  }

  public Date getDemissao() {
    return demissao;
  }

  public void setDemissao(Date demissao) {
    this.demissao = demissao;
  }

  // Set para demissao quando for recebido uma String como data de demissao
  public void setDemissao(String demissao) throws ParseException {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
    Date data = formato.parse(demissao);
    this.demissao = data;
  }

  public Float getSalario() {
    return salario;
  }

  public void setSalario(Float salario) {
    this.salario = salario;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
  }
}
