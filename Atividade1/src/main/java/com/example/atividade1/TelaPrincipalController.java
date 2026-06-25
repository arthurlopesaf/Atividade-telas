package com.example.atividade1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    Label lblResultado;

    @FXML
    TextField txtNumeroInserido;

    //Botão
    public void VerificarParouImpar(ActionEvent actionEvent) {
        //Processar se o número é par ou ímpar e tratar números inválidos
        try {
            int numero = Integer.parseInt(txtNumeroInserido.getText());

            if (numero % 2 == 0) {
                lblResultado.setText("O número é par");
            } else {
                lblResultado.setText("O número é ímpar");
            }

        } catch (NumberFormatException e) {
            lblResultado.setText("Valor inválido! Digite um número inteiro.");
        }
    }
}
