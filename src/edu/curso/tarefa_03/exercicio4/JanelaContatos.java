package edu.curso.tarefa_03.exercicio4;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class JanelaContatos extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Labels
        Label id = new Label("Id: ");
        id.relocate(50, 30);
        Label nome = new Label("Nome: ");
        nome.relocate(50, 70);
        Label telefone = new Label("Telefone: ");
        telefone.relocate(50, 110);

        // TextFiels
        TextField txtId = new TextField("");
        txtId.relocate(100, 30);
        txtId.setPrefSize(400.0, 30.0);
        TextField txtNome = new TextField();
        txtNome.relocate(100, 70);
        txtNome.setPrefSize(400.0, 30.0);
        TextField txtTelefone = new TextField();
        txtTelefone.relocate(100, 110);
        txtTelefone.setPrefSize(400.0, 30.0);

        // Buttons
        Button btnSalvar = new Button("Salvar");
        btnSalvar.relocate(50, 160);
        Button btnPesquisar = new Button("Pesquisar");
        btnPesquisar.relocate(100, 160);

        // Panels
        Pane panel = new Pane();
        panel.getChildren().addAll(id, nome, telefone, txtId, txtNome, txtTelefone, btnSalvar, btnPesquisar);

        // Scenes
        Scene scn = new Scene(panel, 650, 200);
        stage.setScene(scn);
        stage.setTitle("Só sucesso");
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
