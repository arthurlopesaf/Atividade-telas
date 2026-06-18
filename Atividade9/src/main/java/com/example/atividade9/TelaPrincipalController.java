package com.example.atividade9;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class TelaPrincipalController {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero1;

    @FXML
    private TextField txtNumero2;

    @FXML
    private TextField txtNumero3;

    public void btnOrdemDecrescente(ActionEvent actionEvent) {

        try {

            int numero1 = Integer.parseInt(txtNumero1.getText());
            int numero2 = Integer.parseInt(txtNumero2.getText());
            int numero3 = Integer.parseInt(txtNumero3.getText());

            Integer[] numeros = {numero1, numero2, numero3};

            //Ordena a lista em ordem decrescente
            Arrays.sort(numeros, Collections.reverseOrder());

            lblResultado.setText("Números ordenados em ordem decrescente: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);

        } catch (NumberFormatException e) {

            lblResultado.setText("Número inválido");

        }
    }
}
