package edu.curso.tarefa_03.exercicio1.controller;

import java.text.ParseException;
import java.util.Scanner;

import edu.curso.tarefa_03.exercicio1.model.Aluno;

public class GestaoAlunos {
  private int indice;
  private Aluno[] alunos = new Aluno[50];
  private Scanner leitor = new Scanner(System.in);

  public void criar() throws ParseException {
    // Variaveis locais
    String nome, ra, data;
    Long id;

    // Usuário informa os dados do novoAluno
    // ID
    System.out.println("Olá, informe o ID do aluno");
    id = leitor.nextLong();
    // Nome
    System.out.println("Informe o nome do aluno");
    nome = leitor.next();
    leitor.nextLine();
    // Data
    System.out.println("Informe a data de nascimento do aluno, ex: 10/01/2000");
    data = leitor.next();
    leitor.nextLine();
    // RA
    System.out.println("Informe o RA do aluno");
    ra = leitor.next();
    leitor.nextLine();

    // Cria um aluno com as informações recebidas
    Aluno novoAluno = new Aluno(id, nome, data, ra);

    // Verifica se o RA já foi cadastrado
    for (int i = 0; i < alunos.length; i++) {
      // Caso a posição esteja nula então não tem mais alunos no vetor
      if (alunos[i] == null) {
        break;
      }
      // Verifica se existe algum aluno com o mesmo RA informado, se sim cancela a
      // criação do aluno
      else if (alunos[i].getRa().equals(novoAluno.getRa())) {
        System.err.println("Aluno já foi criado!");
        novoAluno = null;
        break;
      }
    }
    alunos[indice] = novoAluno;
    indice++;
    System.out.println("Aluno criado com sucesso");
    System.out.println(alunos[indice - 1].toString());
  }

  public void exibir() {
    // Variaveis Locais
    Aluno buffer;
    String ra;

    // Pede ao usuário o RA
    System.out.println("Olá, informe o RA do aluno que deseja exibir");
    ra = leitor.nextLine();

    // Busca no vetor se existe um aluno com este RA, se sim retorna ele para buffer
    buffer = buscaAluno(ra);

    // Se o buffer for diferente de nullo então exibe as informações do aluno
    if (buffer != null) {
      System.out.println(buffer.toString());
    } // Se não, informa que o RA não foi encontrado
    else {
      System.err.println("Não foi encontrado nenhum aluno com este RA");
    }
  }

  private Aluno buscaAluno(String ra) {
    // Variaveis Locais
    boolean achou = false;
    Aluno buffer = null;

    // Busca no vetor se o aluno existe
    for (Aluno aluno : alunos) {
      // Se aluno é nulo não terá mais alunos na lista, sai do loop
      if (aluno == null) {
        break;
      } else if (aluno.getRa().equals(ra)) {
        buffer = aluno;
        achou = true;
      }
    }

    // Caso o aluno tenha sido encontrado retorna ele
    if (achou) {
      return buffer;
    }
    // Caso o aluno não tenha sido encontrado retorna null
    else {
      return null;
    }
  }

  private int buscaIndiceAluno(String ra) {
    // Variaveis Locais
    boolean achou = false;
    int pos = 0;

    // Busca no vetor se o aluno existe
    for (int i = 0; i < alunos.length; i++) {
      // Se a posição está vazia/nula não tem mais alunos, sai do loop
      if (alunos[i] == null) {
        break;
      }
      // Compara o Ra do aluno do vetor com o RA informado ao método
      else if (alunos[i].getRa().equals(ra)) {
        pos = i;
        achou = true;
        break;
      }
    }

    // Caso o aluno tenha sido encontrado retorna ele
    if (achou) {
      return pos;
    }
    // Caso o aluno não tenha sido encontrado retorna -1
    else {
      return -1;
    }
  }

  public void excluir() {
    // Variaveis Locais
    String ra;
    int i;

    // Usuário informa o RA do aluno que será excluído
    System.out.println("Olá, informe o RA do aluno que deseja excluir");
    ra = leitor.nextLine();

    // Busca no vetor se o aluno existe
    i = buscaIndiceAluno(ra);

    // Se o retorno do método for diferente de -1, o aluno foi encontrado
    // Troca o aluno por NULL
    if (i != -1) {
      alunos[i] = null;
      System.out.println("Aluno excluido com sucesso");
    } // Caso o aluno não tenha sido encontrado informa ao usuário
    else {
      System.err.println("Não foi encontrado nenhum aluno com este RA");
    }
  }

  public void atualizar() throws ParseException {
    // Variaveis Locais
    int i;
    String nome, data;

    // Usuário informa o RA do aluno que será atualizado
    System.out.println("Olá, informe o RA do aluno que deseja atualizar");
    String ra = leitor.nextLine();

    // Busca no vetor se o aluno existe e traz o indice dele no vetor
    i = buscaIndiceAluno(ra);

    if (i != -1) {
      System.out.println("Aluno encontrado!");

      // Usuário informa as novas informações do aluno
      System.out.println("Informe o novo nome do aluno");
      nome = leitor.nextLine();
      System.out.println("Informe a nova data de nascimento do aluno");
      data = leitor.nextLine();

      // Aluno é alterado com as novas informações
      alunos[i].setNome(nome);
      alunos[i].setNascimento(data);
      System.out.println("Alteração feita com sucesso!");
    } else {
      System.err.println("Não foi encontrado nenhum aluno com este RA");
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
          System.exit(0);
          break;
        default:
          System.err.println("Erro, opção invalida, tente novamente");
      }
    }
  }

}
