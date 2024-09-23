package edu.curso.tarefa_03.exercicio2.controller;

import java.text.ParseException;
import java.util.Scanner;

import edu.curso.tarefa_03.exercicio2.model.Funcionario;

public class GestaoFuncionario {
  private int indice;
  private Funcionario[] funcionarios = new Funcionario[50];
  private Scanner leitor = new Scanner(System.in);

  public void criar() throws ParseException {
    // Variaveis locais
    Long id;
    String nome;
    String matricula;
    String dataAd;
    String dataDe;
    Float salario;
    String horario;

    // Usuário informa os dados do novofuncionario
    // ID
    System.out.println("Olá, informe o ID do funcionario");
    id = leitor.nextLong();
    leitor.nextLine();

    // Nome
    System.out.println("Informe o nome do funcionario");
    nome = leitor.nextLine();

    // RA
    System.out.println("Informe a matricula do funcionario");
    matricula = leitor.nextLine();

    // Data
    System.out.println("Informe a data de admissao do funcionario, ex: 10/01/2000");
    dataAd = leitor.next();

    System.out.println("Informe a data de demissao prevista do funcionario, ex: 10/01/2000");
    dataDe = leitor.next();

    // Salario
    System.out.println("Informe o salario do funcionário");
    salario = leitor.nextFloat();
    leitor.nextLine();
    // Horario
    System.out.println("Por fim, informe o horario dele");
    horario = leitor.nextLine();

    // Cria um funcionario com as informações recebidas
    Funcionario novofuncionario = new Funcionario(id, nome, matricula, dataAd, dataDe, salario, horario);

    // Verifica se a matricula já foi cadastrado
    for (int i = 0; i < funcionarios.length; i++) {
      // Caso a posição esteja nula então não tem mais funcionarios no vetor
      if (funcionarios[i] == null) {
        break;
      }
      // Verifica se existe algum funcionario com o mesmo RA informado, se sim cancela
      // a
      // criação do funcionario
      else if (funcionarios[i].getMatricula().equals(novofuncionario.getMatricula())) {
        System.err.println("funcionario já foi criado!");
        novofuncionario = null;
        break;
      }
    }
    funcionarios[indice] = novofuncionario;
    indice++;
    System.out.println("funcionario criado com sucesso");
    funcionarios[indice - 1].exibir();
  }

  public void exibir() {
    // Variaveis Locais
    Funcionario buffer;
    String matricula;

    // Pede ao usuário o RA
    System.out.println("Olá, informe a matricula do funcionario que deseja exibir");
    matricula = leitor.nextLine();

    // Busca no vetor se existe um funcionario com este RA, se sim retorna ele para
    // buffer
    buffer = buscafuncionario(matricula);

    // Se o buffer for diferente de nullo então exibe as informações do funcionario
    if (buffer != null) {
      buffer.exibir();
    } // Se não, informa que o RA não foi encontrado
    else {
      System.err.println("Não foi encontrado nenhum funcionario com esta matricula");
    }
  }

  private Funcionario buscafuncionario(String matricula) {
    // Variaveis Locais
    boolean achou = false;
    Funcionario buffer = null;

    // Busca no vetor se o funcionario existe
    for (Funcionario funcionario : funcionarios) {
      // Se funcionario é nulo não terá mais funcionarios na lista, sai do loop
      if (funcionario == null) {
        break;
      } else if (funcionario.getMatricula().equals(matricula)) {
        buffer = funcionario;
        achou = true;
      }
    }

    // Caso o funcionario tenha sido encontrado retorna ele
    if (achou) {
      return buffer;
    }
    // Caso o funcionario não tenha sido encontrado retorna null
    else {
      return null;
    }
  }

  private int buscaIndicefuncionario(String matricula) {
    // Variaveis Locais
    boolean achou = false;
    int pos = 0;

    // Busca no vetor se o funcionario existe
    for (int i = 0; i < funcionarios.length; i++) {
      // Se a posição está vazia/nula não tem mais funcionarios, sai do loop
      if (funcionarios[i] == null) {
        break;
      }
      // Compara o Ra do funcionario do vetor com o RA informado ao método
      else if (funcionarios[i].getMatricula().equals(matricula)) {
        pos = i;
        achou = true;
        break;
      }
    }

    // Caso o funcionario tenha sido encontrado retorna ele
    if (achou) {
      return pos;
    }
    // Caso o funcionario não tenha sido encontrado retorna -1
    else {
      return -1;
    }
  }

  public void excluir() {
    // Variaveis Locais
    String matricula;
    int i;

    // Usuário informa a matricula do funcionario que será excluído
    System.out.println("Olá, informe a matricula do funcionario que deseja excluir");
    matricula = leitor.nextLine();

    // Busca no vetor se o funcionario existe
    i = buscaIndicefuncionario(matricula);

    // Se o retorno do método for diferente de -1, o funcionario foi encontrado
    // Troca o funcionario por NULL
    if (i != -1) {
      funcionarios[i] = null;
      System.out.println("funcionario excluido com sucesso");
    } // Caso o funcionario não tenha sido encontrado informa ao usuário
    else {
      System.err.println("Não foi encontrado nenhum funcionario com este RA");
    }
  }

  public void atualizar() throws ParseException {
    // Variaveis Locais
    int i;
    String nome;
    String dataAd;
    String dataDe;
    String horario;
    Float salario;

    // Usuário informa o RA do funcionario que será atualizado
    System.out.println("Olá, informe a matricula do funcionario que deseja atualizar");
    String matricula = leitor.nextLine();
    // Busca no vetor se o funcionario existe e traz o indice dele no vetor
    i = buscaIndicefuncionario(matricula);

    // Caso retorno do método acima, for diferente de -1, funcionário encontrado
    if (i != -1) {
      System.out.println("Funcionário encontrado!");

      // Usuário informa as novas informações do funcionario
      System.out.println("Informe o novo nome do funcionário");
      nome = leitor.nextLine();
      // leitor.next();

      System.out.println("Informe a nova data de admissao do funcionário");
      dataAd = leitor.next();
      // leitor.next();

      System.out.println("Informe a nova data de demissao do funcionário");
      dataDe = leitor.next();
      // leitor.next();

      System.out.println("Informe o novo salario do funcionário");
      salario = leitor.nextFloat();
      leitor.nextLine();

      System.out.println("Por fim, informe o novo horário do funcionário");
      horario = leitor.nextLine();
      // leitor.next();

      // funcionario é alterado com as novas informações
      funcionarios[i].setNome(nome);
      funcionarios[i].setAdmissao(dataAd);
      funcionarios[i].setDemissao(dataDe);
      funcionarios[i].setSalario(salario);
      funcionarios[i].setHorario(horario);

      System.out.println("Alteração feita com sucesso!");
    } // Caso retorno do método acima for -1, não foi encontrado o funcionário
    else {
      System.err.println("Não foi encontrado nenhum funcionário com esta matricula");
    }
  }

  public void menu() throws ParseException {
    String opc = null;
    char letra = ' ';
    while (letra != 'S') {
      System.out.println("Olá, informe qual opção deseja executar\n"
          + "(C)riar  (E)xibir    (R)emover\n"
          + "(A)tualizar  (S)air");
      opc = leitor.nextLine().toUpperCase();
      letra = opc.charAt(0);
      switch (letra) {
        case 'C':
          criar();
          break;
        case 'E':
          exibir();
          break;
        case 'R':
          excluir();
          break;
        case 'A':
          atualizar();
          break;
        case 'S':
          leitor.close();
          System.exit(0);
          break;
        default:
          System.err.println("Erro, opção invalida, tente novamente");
      }
    }
  }
}
