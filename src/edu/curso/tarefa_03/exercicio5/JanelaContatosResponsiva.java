package edu.curso.tarefa_03.exercicio5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JanelaContatosResponsiva extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    // Panels
    GridPane grid = new GridPane();
    grid.setVgap(10);
    grid.setHgap(6);

    // Labels
    Label id = new Label("Id");
    Label nome = new Label("Nome");
    Label telefone = new Label("Telefone");
    grid.add(id, 3, 3);
    grid.add(nome, 3, 4);
    grid.add(telefone, 3, 5);

    // TextField
    TextField txtId = new TextField("");
    txtId.setPrefSize(400.0, 30.0);
    grid.add(txtId, 8, 3);
    TextField txtNome = new TextField();
    txtNome.setPrefSize(400.0, 30.0);
    grid.add(txtNome, 8, 4);
    TextField txtTelefone = new TextField();
    txtTelefone.setPrefSize(400.0, 30.0);
    grid.add(txtTelefone, 8, 5);

    // Buttons
    Button btnSalvar = new Button("Salvar");
    grid.add(btnSalvar, 3, 6);
    Button btnPesquisar = new Button("Pesquisar");
    grid.add(btnPesquisar, 4, 6);

    // Scenes
    Scene scn = new Scene(grid, 650, 200);
    stage.setScene(scn);
    stage.setTitle("Só sucesso");
    stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
