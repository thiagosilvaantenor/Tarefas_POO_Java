package edu.curso.tarefa_02.exercicio2;

import java.util.ArrayList;
import java.util.List;

import edu.curso.tarefa_02.exercicio2.celular.Bateria;
import edu.curso.tarefa_02.exercicio2.celular.Celular;
import edu.curso.tarefa_02.exercicio2.celular.FoneDeOuvido;
import edu.curso.tarefa_02.exercicio2.extintor.AgenteExtintor;
import edu.curso.tarefa_02.exercicio2.extintor.Extintor;
import edu.curso.tarefa_02.exercicio2.extintor.SuporteDeParede;
import edu.curso.tarefa_02.exercicio2.guarda_roupa.GuardaRoupa;
import edu.curso.tarefa_02.exercicio2.guarda_roupa.Porta;
import edu.curso.tarefa_02.exercicio2.guarda_roupa.Roupa;

public class Teste {
  public static void main(String[] args) {
    // Instanciar classes e realizar o vinculo das principais com suas agregações e
    // composições:
    // Celular:
    FoneDeOuvido foneDeOuvido = new FoneDeOuvido("JBL Wave Flex", "Bluetooth");
    Bateria bateria = new Bateria(4.2, 5);
    Celular celular = new Celular("Moto One Fusion", "Motorola", bateria, foneDeOuvido);
    //

    // Guarda Roupa
    Porta porta1 = new Porta("madeira");
    Porta porta2 = new Porta("madeira");
    Porta portas[] = { porta1, porta2 };
    List<Roupa> roupas = new ArrayList<>();
    Roupa roupa = new Roupa("Camiseta", "Azul", "G");
    roupas.add(roupa);
    GuardaRoupa guardaRoupa = new GuardaRoupa(2, 2.0, 1.34, roupas, portas);
    //

    // Extintor
    AgenteExtintor agenteExtintor = new AgenteExtintor("Água");
    SuporteDeParede suporteDeParede = new SuporteDeParede(6.0);
    Extintor extintor = new Extintor("A", agenteExtintor, suporteDeParede);

  }
}
