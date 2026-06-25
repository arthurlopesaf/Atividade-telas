package org.example.atividade18;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class TelaPrincipalController {

    CafeComAdicional verificar = new CafeComAdicional();

    @FXML
    private Label lblResultado;

    @FXML
    private RadioButton rdbSimLeite;

    @FXML
    private RadioButton rdbSimAcucar;

    public void btnPrepararCafe(ActionEvent event) {

        boolean acucar = rdbSimAcucar.isSelected();
        boolean leite = rdbSimLeite.isSelected();

        verificar.setLeite(leite);
        verificar.setAcucar(acucar);

        lblResultado.setText(verificar.PrepararCafe());
    }
}
