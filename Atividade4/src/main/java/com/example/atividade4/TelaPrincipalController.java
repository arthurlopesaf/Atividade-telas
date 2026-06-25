package com.example.atividade4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero;

    public void btnCalcularMaior(ActionEvent actionEvent) {

        try {

            double numero = Double.parseDouble(txtNumero.getText());

            if (numero > 20) {

                numero = numero / 2;
                lblResultado.setText("Metade: " + String.format("%.2f", numero));

            } else {

                lblResultado.setText("Número menor que 20");
            }

        } catch (NumberFormatException e) {

            lblResultado.setText("Digite um número");
        }
    }
}