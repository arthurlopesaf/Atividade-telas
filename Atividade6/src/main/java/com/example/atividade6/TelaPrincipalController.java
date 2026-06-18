package com.example.atividade6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero;

    public void btnClassificar(ActionEvent actionEvent) {

        try {

            int numero = Integer.parseInt(txtNumero.getText());

            if (numero % 3 == 0 && numero % 7 == 0) {

                lblResultado.setText("O número: " + numero + " é divisível por 3 e 7!");

            } else {

                lblResultado.setText("O número: " + numero + " não é divisível por 7 e 3!");

            }

        } catch (NumberFormatException e) {

            lblResultado.setText("Digite um número válido");

        }
    }
}
