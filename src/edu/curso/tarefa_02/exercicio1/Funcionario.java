package edu.curso.tarefa_02.exercicio1;

public class Funcionario  extends Pessoa{
    private String cargo;
    private Float salario;

    public Funcionario(String cargo, Float salario){
      this.cargo = cargo;
      this.salario = salario;
    }

    public Funcionario(String cargo){
      this(cargo, 1412.0f);
    }

    public Funcionario(){
      super();
    }

    public void trabalhar(){
      System.out.printf("Funcionario (Cargo: %s) está trabalhando", this.cargo);
    }
}
