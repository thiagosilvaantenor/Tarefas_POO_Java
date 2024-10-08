package edu.curso.tarefa_04.exercicio1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CursoBoundary extends Application {
  // Instancia do control
  private CursoControl controle = new CursoControl();

  // Campo de texto
  private TextField txtId = new TextField();
  private TextField txtNome = new TextField();
  private TextField txtCodCurso = new TextField();
  private TextField txtNomeCoord = new TextField();
  private TextField txtQntAlunos = new TextField();

  @Override
  public void start(Stage stage) throws Exception {
    // Pane
    GridPane pane = new GridPane();
    pane.setVgap(5);
    pane.setHgap(7);

    // Labels
    Label id = new Label("id");
    Label nome = new Label("Nome");
    Label codigoCurso = new Label("Codigo Curso");
    Label nomeCoordenador = new Label("Nome do Coordenador");
    Label qntAlunos = new Label("Quantidade de Alunos");

    // Posicionamento das labels
    pane.add(id, 0, 0);
    pane.add(nome, 0, 1);
    pane.add(codigoCurso, 0, 2);
    pane.add(nomeCoordenador, 0, 3);
    pane.add(qntAlunos, 0, 4);

    // Posicionamento dos TextFields
    pane.add(txtId, 1, 0);
    pane.add(txtNome, 1, 1);
    pane.add(txtCodCurso, 1, 2);
    pane.add(txtNomeCoord, 1, 3);
    pane.add(txtQntAlunos, 1, 4);

    // Botões e suas funções
    Button btnAdicionar = new Button("Adicionar");
    Button btnPesqusiar = new Button("Pesquisar");

    btnAdicionar.setOnAction(e -> {
      controle.gravar(toEntity());
    });

    btnPesqusiar.setOnAction(e -> {

      Curso c = controle.pesquisar(txtNome.getText());
      if (c != null) {
        fromEntity(c);
      }

    });

    // Posicionamento dos botões
    pane.add(btnAdicionar, 0, 5);
    pane.add(btnPesqusiar, 1, 5);

    // Scene
    Scene cena = new Scene(pane, 600, 300);
    stage.setScene(cena);
    stage.setTitle("Cadastro de Curso");
    stage.show();

  }

  // Gera e retorna uma entidade (Curso)
  public Curso toEntity() {
    Curso c = new Curso();
    c.setId(Long.parseLong(txtId.getText()));
    c.setNome(txtNome.getText());
    c.setCodigo(Integer.parseInt(txtCodCurso.getText()));
    c.setNomeCoordenador(txtNomeCoord.getText());
    c.setQntAlunos(Integer.parseInt(txtQntAlunos.getText()));

    return c;
  }

  // Recebe uma entidade(Curso) e passa seus dados para a boundary
  public void fromEntity(Curso c) {
    if (c != null) {
      txtId.setText(Long.toString(c.getId()));
      txtNome.setText(c.getNome());
      txtCodCurso.setText(Integer.toString(c.getCodigo()));
      txtNomeCoord.setText(c.getNomeCoordenador());
      txtQntAlunos.setText(Integer.toString(c.getQntAlunos()));
    }
  }
}
