package cruds.gestaoPedidos.estoque;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.Callback;
import javafx.util.StringConverter;
import javafx.util.converter.IntegerStringConverter;

public class EstoqueBoundary extends Application {

  private Label lbId = new Label("");
  private TextField txtMed = new TextField();
  private TextField txtQnt = new TextField();
  private TextField txtForn = new TextField();
  private TextField txtFuncionarioReg = new TextField();

  private EstoqueControl control = new EstoqueControl();

  private TableView<Estoque> tableView = new TableView<>();

  @Override
  public void start(Stage stage) {
    // Panes
    BorderPane panePrincipal = new BorderPane();
    GridPane paneForm = new GridPane();

    // Labels e Campos
    paneForm.add(new Label("Id: "), 0, 0);
    paneForm.add(lbId, 1, 0);
    paneForm.add(new Label("Nome Medicamento: "), 0, 1);
    paneForm.add(txtMed, 1, 1);
    paneForm.add(new Label("Quantidade: "), 0, 2);
    paneForm.add(txtQnt, 1, 2);
    paneForm.add(new Label("Fornecedor: "), 0, 3);
    paneForm.add(txtForn, 1, 3);
    paneForm.add(new Label("Registro do Funcionario: "), 0, 4);
    paneForm.add(txtFuncionarioReg, 1, 4);

    // Btns
    Button btnGravar = new Button("Gravar");
    btnGravar.setOnAction(
        e -> {
          control.gravar();
          tableView.refresh();
        });

    paneForm.add(btnGravar, 0, 5);

    Button btnPesquisar = new Button("Pesquisar");
    btnPesquisar.setOnAction(e -> control.pesquisarPorMedicamento());

    paneForm.add(btnPesquisar, 1, 5);

    Button btnLimpa = new Button("*");
    btnLimpa.setOnAction(e -> control.limparTudo());
    paneForm.add(btnLimpa, 2, 0);

    vincularPropriedade();
    generateColumns();

    panePrincipal.setTop(paneForm);
    panePrincipal.setCenter(tableView);


    Scene scn = new Scene(panePrincipal, 600, 400);
    stage.setScene(scn);
    stage.setTitle("Cadastro de Medicamentos no Estoque");
    stage.show();
  }

  public void generateColumns() {
    // Cria Colunas
    TableColumn<Estoque, Integer> col1 = new TableColumn<>("Id");
    col1.setCellValueFactory(new PropertyValueFactory<Estoque, Integer>("id"));
    // Pega o valor do atributo da classe modelo, nome deve estar da mesma forma que
    // o atributo
    TableColumn<Estoque, String> col2 = new TableColumn<>("Medicamento");
    col2.setCellValueFactory(new PropertyValueFactory<Estoque, String>("medicamento"));

    TableColumn<Estoque, Integer> col3 = new TableColumn<Estoque, Integer>("Quantidade");
    col3.setCellValueFactory(new PropertyValueFactory<Estoque, Integer>("quantidade"));

    TableColumn<Estoque, String> col4 = new TableColumn<Estoque, String>("Fornecedor");
    col4.setCellValueFactory(new PropertyValueFactory<Estoque, String>("fornecedor"));

    TableColumn<Estoque, Integer> col5 = new TableColumn<Estoque, Integer>("RegistroFuncionario");
    col5.setCellValueFactory(new PropertyValueFactory<Estoque, Integer>("funcionarioRegistro"));

    // Função callback para criar o fabricante da celula e o botão excluir
    Callback<TableColumn<Estoque, Void>, TableCell<Estoque, Void>> callback = new Callback<>() {
      @Override
      public TableCell<Estoque, Void> call(TableColumn<Estoque, Void> param) {
        TableCell<Estoque, Void> tc = new TableCell<>() {
          final Button btnExcluir = new Button("Apagar");
          {
            btnExcluir.setOnAction(
                e -> {
                  Estoque es = tableView.getItems().get(getIndex());
                  control.excluir(es);
                });
          }

          public void updateItem(Void item, boolean empty) {
            super.updateItem(item, empty);
            if (empty) {
              setGraphic(null);
            } else {
              setGraphic(btnExcluir);
            }
          }
        };
        return tc;

      }

    };
    TableColumn<Estoque, Void> col6 = new TableColumn<>("Ações");
    col6.setCellFactory(callback);

    tableView.getColumns().addAll(col1, col2, col3, col4, col5, col6);
    tableView.setItems(control.getLista());

    tableView.getSelectionModel().selectedItemProperty()
        .addListener((obs, velho, novo) -> {
          System.out.println("Selecionado o medicamento ==> " + novo);
          control.entidadeParaTela(novo);
        });

  }

  public void vincularPropriedade() {
    // Vincular label e campos com os atributos da controller
    // Id
    Bindings.bindBidirectional(lbId.textProperty(), control.idProperty(),
        (StringConverter) new IntegerStringConverter());
    // Medicamento
    Bindings.bindBidirectional(txtMed.textProperty(), control.medicamentoProperty());
    // Quantidade
    Bindings.bindBidirectional(txtQnt.textProperty(), control.quantidadeProperty(),
        (StringConverter) new IntegerStringConverter());
    // Fornecedor
    Bindings.bindBidirectional(txtForn.textProperty(), control.fornecedorProperty());
    // Fornecedor
    Bindings.bindBidirectional(txtFuncionarioReg.textProperty(), control.funcionarioRegistroProperty(),
        (StringConverter) new IntegerStringConverter());

  }

  public static void main(String[] args) {
    launch(EstoqueBoundary.class, args);
  }

}
