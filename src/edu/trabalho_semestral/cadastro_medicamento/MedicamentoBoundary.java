package cadastro_medicamento;

import java.text.NumberFormat;
import java.time.LocalDate;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MedicamentoBoundary extends Application {
  private Label lbId = new Label("");
  private TextField txtNome = new TextField("");
  private TextField txtDesc = new TextField();
  private TextField txtComp = new TextField();
  private DatePicker dtFab = new DatePicker();
  private DatePicker dtVal = new DatePicker();
  private TextField txtContra = new TextField();
  private TextField txtPreco = new TextField();

  private MedicamentoControl control = new MedicamentoControl();

  private TableView<Medicamento> tableView = new TableView<>();

  @Override
  public void start(Stage stage) {
    BorderPane panePrincipal = new BorderPane();

    GridPane paneForm = new GridPane();
    paneForm.setVgap(10);
    paneForm.add(new Label("Id: "), 0, 0);
    paneForm.add(lbId, 1, 0);
    paneForm.add(new Label("Nome: "), 0, 1);
    paneForm.add(txtNome, 1, 1);
    paneForm.add(new Label("Descrição: "), 0, 2);
    paneForm.add(txtDesc, 1, 2);
    paneForm.add(new Label("Composição: "), 0, 3);
    paneForm.add(txtComp, 1, 3);
    paneForm.add(new Label("Data Fabricação: "), 0, 4);
    paneForm.add(dtFab, 1, 4);
    paneForm.add(new Label("Data Validade: "), 0, 5);
    paneForm.add(dtVal, 1, 5);
    paneForm.add(new Label("ContraIndicação: "), 0, 6);
    paneForm.add(txtContra, 1, 6);
    paneForm.add(new Label("Preço"), 0, 7);
    paneForm.add(txtPreco, 1, 7);

    Button btnAdicionar = new Button("Adicionar");
    paneForm.add(btnAdicionar, 0, 8);

    btnAdicionar.setOnAction(e -> {
      control.adicionar();

      // A FAZER: Apos adicionado deveria limpar os campos
    });

    Button btnBuscar = new Button("Buscar");
    paneForm.add(btnBuscar, 1, 8);
    btnBuscar.setOnAction(e -> control.pesquisarPorNome());

    // A fazer: funções dos butões de remover e atualizar
    Button btnRemover = new Button("Remover");
    paneForm.add(btnRemover, 0, 9);
    Button btnAtualizar = new Button("Atualizar");
    paneForm.add(btnAtualizar, 1, 9);

    generateColumns();
    vincularPropriedades();

    panePrincipal.setTop(paneForm);

    panePrincipal.setCenter(tableView);

    Scene scn = new Scene(panePrincipal, 600, 400);
    stage.setScene(scn);
    stage.setTitle("Cadastro de Médicamentos");
    stage.show();

  }

  public void vincularPropriedades() {
    Bindings.bindBidirectional(txtNome.textProperty(), control.nomeProperty());

    Bindings.bindBidirectional(txtDesc.textProperty(), control.descricaoProperty());

    Bindings.bindBidirectional(txtComp.textProperty(), control.composicaoProperty());

    Bindings.bindBidirectional(dtFab.valueProperty(), control.dtFabricacaoProperty());

    Bindings.bindBidirectional(dtVal.valueProperty(), control.dtValidadeProperty());

    // Para consertar:
    // ContraIndicaçaõ não esta re aparecendo na hora de buscar
    Bindings.bindBidirectional(txtContra.textProperty(), control.contraindicacaoProperty());

    // Para consertar:
    // Essa gambiarra não está funcionando, perguntar como usar bind em textProperty
    // para DoubleProperty
    txtPreco.textProperty().bindBidirectional(control.precoUnidadeProperty(), NumberFormat.getInstance());

  }

  public void generateColumns() {

    //A arrumar: Apenas id, Nome e Composição estão sendo atualizados, verificar o erro e garantir que todos sejam atualizados
    TableColumn<Medicamento, Long> col1 = new TableColumn<>("Id");
    col1.setCellValueFactory(new PropertyValueFactory<Medicamento, Long>("id"));

    TableColumn<Medicamento, String> col2 = new TableColumn<>("Nome");
    col2.setCellValueFactory(new PropertyValueFactory<Medicamento, String>("nome"));

    TableColumn<Medicamento, String> col3 = new TableColumn<>("Descrição");

    col3.setCellValueFactory(new PropertyValueFactory<Medicamento, String>("descrição"));

    TableColumn<Medicamento, String> col4 = new TableColumn<>("Composicao");

    col4.setCellValueFactory(new PropertyValueFactory<Medicamento, String>("composicao"));

    TableColumn<Medicamento, LocalDate> col5 = new TableColumn<>("Fabricacao");

    col5.setCellValueFactory(new PropertyValueFactory<Medicamento, LocalDate>("fabricacao"));

    TableColumn<Medicamento, LocalDate> col6 = new TableColumn<>("Validade");

    col6.setCellValueFactory(new PropertyValueFactory<Medicamento, LocalDate>("validade"));

    TableColumn<Medicamento, String> col7 = new TableColumn<>("ContraIndicacao");

    col7.setCellValueFactory(new PropertyValueFactory<Medicamento, String>("contraIndicacao"));

    TableColumn<Medicamento, Double> col8 = new TableColumn<>("Preco");

    col8.setCellValueFactory(new PropertyValueFactory<Medicamento, Double>("preco"));

    tableView.getColumns().addAll(col1, col2, col3, col4, col5, col6, col7, col8);

    tableView.setItems(control.getListaMedicamento());

  }

  public static void main(String[] args) {
    Application.launch(MedicamentoBoundary.class, args);
  }
}
