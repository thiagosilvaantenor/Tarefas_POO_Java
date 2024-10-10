package edu.curso.tarefa_04.exercicio2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AlunoBoundary extends Application {

  private AlunoControl control = new AlunoControl();

  private TextField txtId = new TextField();
  private TextField txtRa = new TextField();
  private TextField txtNome = new TextField();
  private TextField txtNasc = new TextField();

  @Override
  public void start(Stage stage) {
    // Pane
    GridPane pane = new GridPane();
    pane.setHgap(10);

    // Labels
    Label id = new Label("id");
    Label ra = new Label("RA");
    Label nome = new Label("Nome");
    Label nasc = new Label("Nascimento");

    // posicionamento label
    pane.add(id, 0, 0);
    pane.add(ra, 0, 1);
    pane.add(nome, 0, 2);
    pane.add(nasc, 0, 3);

    // posicionamento txtfield
    pane.add(txtId, 1, 0);
    pane.add(txtRa, 1, 1);
    pane.add(txtNome, 1, 2);
    pane.add(txtNasc, 1, 3);

    // btn
    Button btnAdd = new Button("Adicionar");
    Button btnPesq = new Button("Pesquisar");

    btnAdd.setOnAction(e -> {
      control.adicionar(boundaryToEntity());
    });

    btnPesq.setOnAction(e -> {
      Aluno a = control.pesquisarPorNome(txtNome.getText());

      if (a != null) {
        entityToBoundary(a);
      } else {
        System.out.println("Aluno não cadastrado!");
      }
    });

    // posicionamento btn
    pane.add(btnAdd, 0, 4);
    pane.add(btnPesq, 1, 4);

    // Scene e Stage
    Scene cena = new Scene(pane, 600, 300);
    stage.setScene(cena);
    stage.setTitle("Gestão de alunos");
    stage.show();
  }

  public void entityToBoundary(Aluno a) {
    txtId.setText(Long.toString(a.getId()));
    txtRa.setText(a.getRa());
    txtNome.setText(a.getNome());
    // Formatacao date
    SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");

    Date data = a.getNascimento();
    String dataFormatada = formatador.format(data);
    System.out.println(dataFormatada);
    txtNasc.setText(dataFormatada);
  }

  // da tela para a entidade
  public Aluno boundaryToEntity() {
    Aluno a = new Aluno();
    a.setId(Long.parseLong(txtId.getText()));
    a.setRa(txtRa.getText());
    a.setNome(txtNome.getText());
    try {
      a.setNascimento(txtNasc.getText());
    } catch (ParseException e) {
      e.printStackTrace();
    }
    // AAAA-MM-DD

    return a;
  }

  public static void main(String[] args) {
    launch(AlunoBoundary.class, args);
  }

}