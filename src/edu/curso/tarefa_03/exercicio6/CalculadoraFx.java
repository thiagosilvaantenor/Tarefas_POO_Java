package edu.curso.tarefa_03.exercicio6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculadoraFx extends Application {

  @Override
  public void start(Stage stage) throws Exception {
    // Painels
    GridPane gridPane = new GridPane();
    gridPane.setVgap(7);
    gridPane.setHgap(10);
    FlowPane flowPane = new FlowPane();
    flowPane.setHgap(10);

    // Elementos
    // Campo de digitação
    TextArea campoNumerico = new TextArea();
    campoNumerico.setMaxSize(200.0, 10.0);
    flowPane.getChildren().add(campoNumerico);

    // Botão de apagar
    Button btnCE = new Button("CE");
    btnCE.setMinSize(32, 32);
    // gridPane.add(btnCE, 2, 1);
    flowPane.getChildren().add(btnCE);

    // Botões numéricos
    Button btn0 = new Button("0");
    btn0.setMinSize(50, 50);
    gridPane.add(btn0, 2, 5);

    Button btn1 = new Button("1");
    btn1.setMinSize(50, 50);
    gridPane.add(btn1, 1, 2);

    Button btn2 = new Button("2");
    btn2.setMinSize(50, 50);
    gridPane.add(btn2, 2, 2);

    Button btn3 = new Button("3");
    btn3.setMinSize(50, 50);
    gridPane.add(btn3, 3, 2);

    Button btn4 = new Button("4");
    btn4.setMinSize(50, 50);
    gridPane.add(btn4, 1, 3);

    Button btn5 = new Button("5");
    btn5.setMinSize(50, 50);
    gridPane.add(btn5, 2, 3);

    Button btn6 = new Button("6");
    btn6.setMinSize(50, 50);
    gridPane.add(btn6, 3, 3);

    Button btn7 = new Button("7");
    btn7.setMinSize(50, 50);
    gridPane.add(btn7, 1, 4);

    Button btn8 = new Button("8");
    btn8.setMinSize(50, 50);
    gridPane.add(btn8, 2, 4);

    Button btn9 = new Button("9");
    btn9.setMinSize(50, 50);
    gridPane.add(btn9, 3, 4);

    // Botões de sinais
    Button btnVirgula = new Button(",");
    btnVirgula.setMinSize(50, 50);
    gridPane.add(btnVirgula, 1, 5);

    Button btnSoma = new Button("+");
    btnSoma.setMinSize(50, 50);
    gridPane.add(btnSoma, 4, 2);

    Button btnSub = new Button("-");
    btnSub.setMinSize(50, 50);
    gridPane.add(btnSub, 4, 3);

    Button btnDiv = new Button("/");
    btnDiv.setMinSize(50, 50);
    gridPane.add(btnDiv, 4, 5);

    Button btnMult = new Button("*");
    btnMult.setMinSize(50, 50);
    gridPane.add(btnMult, 4, 4);

    Button btnIgual = new Button("=");
    btnIgual.setMinSize(50, 50);
    gridPane.add(btnIgual, 3, 5);

    flowPane.getChildren().add(gridPane);
    // Scene
    Scene cena = new Scene(flowPane, 250, 290);
    stage.setScene(cena);
    stage.setTitle("Calculadora");
    stage.show();
  }

  public static void main(String[] args) {
    Application.launch(args);
  }
}
