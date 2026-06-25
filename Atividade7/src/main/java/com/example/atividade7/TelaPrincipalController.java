package com.example.atividade7;

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

            if (numero % 10 == 0 && numero % 5 == 0 && numero % 2 == 0) {

                lblResultado.setText("O número: " + numero + " é divisível por 10, 5 e 2 !");

            } else {

                lblResultado.setText("O número: " + numero + " não é divisível por 10, 5 e 2 !");

            }

        } catch (NumberFormatException e) {

            lblResultado.setText("Digite um número válido");

        }
    }
}
