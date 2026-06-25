package com.example.atividade22;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    NumeroForaDaFaixa NumeroForaDaFaixa = new NumeroForaDaFaixa();

    int numero;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero;

    public void btnValidarNumero(ActionEvent actionEvent) {

        try {
            numero = Integer.parseInt(txtNumero.getText());

            NumeroForaDaFaixa.setNumero(numero);

            lblResultado.setText(NumeroForaDaFaixa.ValidarNumero());

        } catch (NumberFormatException e) {

            lblResultado.setText("Digite um número válido");

        }

    }
}
