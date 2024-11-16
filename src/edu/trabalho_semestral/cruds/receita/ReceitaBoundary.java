package cruds.receita;

import java.time.LocalDate;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.util.StringConverter;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
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
import javafx.util.converter.IntegerStringConverter;

public class ReceitaBoundary extends Application {
  // Campos e Label
  private Label lbId = new Label("");
  private TextField txtPacienteId = new TextField("");
  private DatePicker dateReceita = new DatePicker(LocalDate.now());
  private TextField txtCRM = new TextField("");
  //Fazer um campo para medicamentos da receita

  // Table
  private TableView<Receita> tableView = new TableView<>();

  // control
  private ReceitaControl control = new ReceitaControl();

  @Override
  public void start(Stage stage) {
    // Panes
    BorderPane panePrincipal = new BorderPane();
    GridPane paneForm = new GridPane();

    // Labels e TextFields
    paneForm.add(new Label("Id: "), 0, 0);
    paneForm.add(lbId, 1, 0);
    paneForm.add(new Label("Id do Paciente: "), 0, 1);
    paneForm.add(txtPacienteId, 1, 1);
    paneForm.add(new Label("Data da Receita: "), 0, 2);
    paneForm.add(dateReceita, 1, 2);
    paneForm.add(new Label("CRM do Médico: "), 0, 3);
    paneForm.add(txtCRM, 1, 3);

    // Btns
    Button btnGravar = new Button("Gravar");
    btnGravar.setOnAction(
        e -> {
          control.gravar();
          tableView.refresh();
        });

    Button btnPesquisar = new Button("Pesquisar");
    btnPesquisar.setOnAction(e -> control.pesquisarPorData());

    Button btnLimpar = new Button("*");
    btnLimpar.setOnAction(e -> control.limparTudo());

    paneForm.add(btnGravar, 0, 4);
    paneForm.add(btnPesquisar, 1, 4);
    paneForm.add(btnLimpar, 2, 0);

    generateColumns();
    vincularPropriedades();

    panePrincipal.setTop(paneForm);
    panePrincipal.setCenter(tableView);

    Scene scn = new Scene(panePrincipal, 600, 400);
    stage.setScene(scn);
    stage.setTitle("Cadastro de Receitas");
    stage.show();
  }

  public void generateColumns() {
    // Cria Colunas
    TableColumn<Receita, Integer> col1 = new TableColumn<>("Id");
    col1.setCellValueFactory(new PropertyValueFactory<Receita, Integer>("id"));
    //Pega o valor do atributo da classe modelo, nome deve estar da mesma forma que o atributo
    
    TableColumn<Receita, Integer> col2 = new TableColumn<>("PacienteID");
    col2.setCellValueFactory(new PropertyValueFactory<Receita, Integer>("pacienteId"));

    TableColumn<Receita, LocalDate> col3 = new TableColumn<>("DataReceita");
    col3.setCellValueFactory(new PropertyValueFactory<Receita, LocalDate>("dataReceita"));

    TableColumn<Receita, String> col4 = new TableColumn<>("CRM");
    col4.setCellValueFactory(new PropertyValueFactory<Receita, String>("medicoCRM"));

    // Cria o fabricante da Celula
    Callback<TableColumn<Receita, Void>, TableCell<Receita, Void>> callback = new Callback<>() {
      @Override
      public TableCell<Receita, Void> call(TableColumn<Receita, Void> param) {
        TableCell<Receita, Void> tc = new TableCell<>() {
          final Button btnExcluir = new Button("Apagar");
          {
            btnExcluir.setOnAction(
                e -> {
                  Receita m = tableView.getItems().get(getIndex());
                  control.excluir(m);
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

    TableColumn<Receita, Void> col5 = new TableColumn<>("Ações");
    col5.setCellFactory(callback);

    tableView.getColumns().addAll(col1, col2, col3, col4, col5);
    tableView.setItems(control.getLista());

    tableView.getSelectionModel().selectedItemProperty()
        .addListener((obs, antigo, novo) -> {
          System.out.println("Selecionado a receita ==> " + novo);
          control.entidadeParaTela(novo);
        });

  }

  public void vincularPropriedades() {
    // Vincula label e campos com os atributos da controller
    Bindings.bindBidirectional(lbId.textProperty(), control.idProperty(),
        (StringConverter) new IntegerStringConverter());
    Bindings.bindBidirectional(txtPacienteId.textProperty(), control.pacienteIdProperty(),
        (StringConverter) new IntegerStringConverter());
    Bindings.bindBidirectional(dateReceita.valueProperty(), control.dataReceitaProperty());
    Bindings.bindBidirectional(txtCRM.textProperty(), control.medicoCRMProperty());
  }

  public static void main(String[] args) {
    launch(ReceitaBoundary.class, args);
  }

}
