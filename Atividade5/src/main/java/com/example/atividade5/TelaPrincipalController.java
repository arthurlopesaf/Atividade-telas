package com.example.atividade5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private TextField txtNumero;

    @FXML
    private Label lblResultado;

    public void btnClassificarNumero(ActionEvent actionEvent) {

        try {

            int numero = Integer.parseInt(txtNumero.getText());

            if (numero > 0) {

                lblResultado.setText("O número digitado é positivo!");

            }
            else if (numero < 0)
            {

                lblResultado.setText("O número digitado é negativo!");

            } else {

                lblResultado.setText("O número digitado é nulo!");

            }

        } catch (NumberFormatException e) {

            lblResultado.setText("Digite um numero válido");
        }
    }

}

