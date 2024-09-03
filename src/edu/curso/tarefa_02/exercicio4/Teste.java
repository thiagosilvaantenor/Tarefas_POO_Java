package edu.curso.tarefa_02.exercicio4;

import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    Dinossauro skeep = new Dinossauro();
    Scanner scan = new Scanner(System.in);
    String textoMaiusculo = "";
    char letra = ' ';
    while (letra != 'R') {
      // Exibe as características do skeep
      System.out.println(skeep.toString());
      System.out.println("*** DIGITE APENAS A LETRA (DESTACADA) ***"
          + "\n (P)ular   (C)orrer      Co(M)er"
          + "\n C(A)ntar  Tomar (S)ol   Ficar na S(O)mbra"
          + "\n Sai(R)");
      textoMaiusculo = scan.nextLine().toUpperCase();
      letra = textoMaiusculo.charAt(0);

      switch (letra) {
        case 'P':
          skeep.pular();
          break;
        case 'C':
          skeep.correr();
          break;
        case 'M':
          skeep.comer();
          break;
        case 'A':
          skeep.cantar();
          break;
        case 'S':
          skeep.tomarSol();
          break;
        case 'O':
          skeep.ficarNaSombra();
          break;
        case 'R':
          scan.close();
          break;
        default:
          System.out.println("Opa, opção invalida, tente novamente");
          break;
      }
    }
  }
}
