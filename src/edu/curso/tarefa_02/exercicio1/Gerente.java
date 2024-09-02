package edu.curso.tarefa_02.exercicio1;

public class Gerente extends Funcionario {
  private int quantidadeFuncionarios;

  public Gerente(String cargo, Float salario, int quantidadeFuncionarios) {
    super(cargo, salario);
    this.quantidadeFuncionarios = quantidadeFuncionarios;
  }

  public Gerente(String cargo, Float salario) {
    this(cargo, salario, 20);
  }

  public Gerente(){
    super();
  }

  public void liderarEquipe(){
    System.out.printf("O gerente está liderando a equipe de %d funcionarios", this.quantidadeFuncionarios);
  }
}
