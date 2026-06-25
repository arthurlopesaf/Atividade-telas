package org.example.atividade19;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    Divisibilidade dividir = new Divisibilidade();

    int num;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero;

    public void btnVerificarDivisibilidade(ActionEvent actionEvent) {

        try{

            num = Integer.parseInt(txtNumero.getText());

            dividir.setNum(num);

            lblResultado.setText(dividir.DividirPor3ou5());

        } catch (NumberFormatException e) {

            lblResultado.setText("Número inválido!");

        }
    }
}
