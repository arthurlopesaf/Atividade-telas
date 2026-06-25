package com.example.atividade8;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    private TextField txtNumero3;

    @FXML
    private Label lblResultado;

    public void btnEncontrarMaior(ActionEvent actionEvent) {

        try {

            int numero1 = Integer.parseInt(txtNumero1.getText());
            int numero2 = Integer.parseInt(txtNumero2.getText());
            int numero3 = Integer.parseInt(txtNumero3.getText());

            int maior = Math.max(Math.max(numero1, numero2), numero3);

            lblResultado.setText("O número maior é: " + maior);

        } catch (NumberFormatException e) {

            lblResultado.setText("Número inválido");

        }
    }
}
