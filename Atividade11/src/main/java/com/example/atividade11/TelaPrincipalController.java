package com.example.atividade11;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtValorA;

    @FXML
    private TextField txtValorB;

    @FXML
    private TextField txtValorC;

    public void btnCalcularEquacao(ActionEvent actionEvent) {

        try {

            int a = Integer.parseInt(txtValorA.getText());
            int b = Integer.parseInt(txtValorB.getText());
            int c = Integer.parseInt(txtValorC.getText());

            EquacaoSegundoGrau resolverEquacao = new EquacaoSegundoGrau(a, b, c);

            lblResultado.setText(resolverEquacao.calcular());

        } catch (NumberFormatException e){

          lblResultado.setText("Digite um número válido");

        }
    }
}
