package com.example.atividade21;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    ReconhecimentoDoUsuario reconhecimentoDoUsuario = new ReconhecimentoDoUsuario();

    String usuario;

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNome;

    public void btnVerificarUsuario(ActionEvent actionEvent) {

        usuario = txtNome.getText();

        reconhecimentoDoUsuario.setUsuario(usuario);

        lblResultado.setText(reconhecimentoDoUsuario.ReconhecerUsuario());

    }
}
