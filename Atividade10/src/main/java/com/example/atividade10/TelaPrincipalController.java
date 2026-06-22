package com.example.atividade10;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtIdade;

    public void btnClassificarCategoria(ActionEvent actionEvent) {

        try {
            int idade = Integer.parseInt(txtIdade.getText());

            if (idade < 5) {

                lblResultado.setText("Idade fora da categoria");

            } else if (idade <= 7) {

                lblResultado.setText("Categoria: Infantil A");

            } else if (idade <= 10) {

                lblResultado.setText("Categoria: Infantil B");

            } else if (idade <= 13) {

                lblResultado.setText("Categoria: Juvenil A");

            } else if (idade <= 17) {

                lblResultado.setText("Categoria: Juvenil B");

            } else {

                lblResultado.setText("Categoria: Sênior");

            }

        } catch (NumberFormatException e) {

            lblResultado.setText("Número inválido");

        }
    }
}
