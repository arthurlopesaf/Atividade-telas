package com.example.atividade20;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class TelaPrincipalController {

    ConfirmarCompra confirmarCompra = new ConfirmarCompra();

    boolean desejaComprar;

    @FXML
    private Label lblResultado;

    @FXML
    private RadioButton rdbSim;

    public void btnConfirmarCompra(ActionEvent actionEvent) {

        desejaComprar = rdbSim.isSelected();

        confirmarCompra.setDesejaComprar(desejaComprar);

        lblResultado.setText(confirmarCompra.ConfirmarCompra());
    }
}
