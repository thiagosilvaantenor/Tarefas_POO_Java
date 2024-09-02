package edu.curso.tarefa_02.exercicio3;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Teste {
  public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("Geralt Rivia", "Polonês", LocalDate.of(1, 5, 1994));
    Pessoa pessoa2 = new Pessoa("Yeneffer Vendeberg", "Polonês", LocalDate.of(1, 1, 1994));

    Piloto piloto1 = new Piloto(555555, LocalTime.of(7, 0), LocalTime.of(18, 0));
    Piloto piloto2 = new Piloto(44444, LocalTime.of(18, 0), LocalTime.of(6, 0));

    Aeronave aeronave1 = new Aeronave(30, 278, "Airbus A350-1000", piloto1);
    Aeronave aeronave2 = new Aeronave(40, 278, "Airbus A350-1000", piloto2);

    Passageiro passageiro1 = new Passageiro(101010, "Vancover - Canada", "A");
    Passageiro passageiro2 = new Passageiro(101015, "Vancover - Canada", "B");
    aeronave1.setPassageiro(passageiro1);
    aeronave2.setPassageiro(passageiro2);

    List<Aeronave> aeronaves = new ArrayList<>();

    aeronaves.add(aeronave1);
    aeronaves.add(aeronave2);

    Aeroporto aeroporto1 = new Aeroporto(2, 2, "Rod. Hélio Smidt, s/nº - Aeroporto, Guarulhos - SP, 07190-100",
        aeronaves);

    Aeroporto aeroporto2 = new Aeroporto(1, 1, " Av. Washington Luís, s/nº - Vila Congonhas, São Paulo - SP, 04626-911",
        aeronaves);

  }
}
