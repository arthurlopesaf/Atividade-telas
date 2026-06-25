package com.example.atividade13;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class TelaPrincipalController {

    ValidarPermissao vp = new ValidarPermissao();

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtIdade;

    @FXML
    private RadioButton rdbSim;

    @FXML
    private RadioButton rdbNao;

    public void btnVerificar(ActionEvent actionEvent) {

        try {

            int idadeUsuario =  Integer.parseInt(txtIdade.getText());
            boolean temCarteira = false;

            if (rdbSim.isSelected()) {

                temCarteira = true;

            } else if (rdbNao.isSelected()) {

                temCarteira = false;

            }

            vp.setIdade(idadeUsuario);
            vp.setTemCarteira(temCarteira);

            lblResultado.setText(vp.validar());

        } catch (NumberFormatException e) {

            lblResultado.setText("Insira um número válido");

        }

    }
}
