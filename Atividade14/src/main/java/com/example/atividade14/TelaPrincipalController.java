package com.example.atividade14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

public class TelaPrincipalController {

    VerificacaoDeCompra verificacao = new VerificacaoDeCompra();

    @FXML
    private Label lblResultado;

    @FXML
    private RadioButton rdbSim;

    @FXML
    private RadioButton rdbNao;

    @FXML
    private RadioButton rdbSimDinheiro;

    @FXML
    private RadioButton rdbNaoDinheiro;

    public void btnVerificar(ActionEvent actionEvent) {

        boolean desejaComprar = false;
        boolean temDinheiro = false;

        if (rdbSim.isSelected()) {

            desejaComprar = true;

        } if (rdbNao.isSelected()) {

            desejaComprar = false;

        }

        if (rdbSimDinheiro.isSelected()) {

            temDinheiro = true;

        } if (rdbNaoDinheiro.isSelected()) {

            temDinheiro = false;

        }

        verificacao.setDesejaComprar(desejaComprar);
        verificacao.setTemDinheiro(temDinheiro);

        lblResultado.setText(verificacao.verificarCompra());
    }
}
