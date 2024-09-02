package edu.curso.tarefa_02.exercicio1;

public class Diretor extends Gerente {
  private double verba;

  public Diretor(String cargo, Float salario, int quantidadeFuncionarios, double verba){
    super(cargo,salario,quantidadeFuncionarios);
    this.verba = verba;
  }

  public Diretor(String cargo, Float salario, int quantidadeFuncionarios){
    this(cargo, salario, quantidadeFuncionarios, 50000.0);
  }

  public Diretor(String cargo, Float salario) {
    this(cargo,salario,20);
  }

  public Diretor(String cargo){
    this(cargo,15000.0f);
  }
}
