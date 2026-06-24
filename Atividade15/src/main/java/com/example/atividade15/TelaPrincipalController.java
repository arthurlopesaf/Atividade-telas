package com.example.atividade15;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    boolean temDiploma;
    int idade;

    VerificarVaga verificarVaga = new VerificarVaga();

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtIdade;

    @FXML
    private RadioButton rbdSim;

    @FXML
    private RadioButton rbdNao;

    public void btnVerificarVaga(ActionEvent actionEvent) {

        try{

            idade = Integer.parseInt(txtIdade.getText());

            if (rbdSim.isSelected()) {
                temDiploma = true;
            } else if (rbdNao.isSelected()) {
                temDiploma = false;
            }

            verificarVaga.setIdade(idade);
            verificarVaga.setPossuiDiploma(temDiploma);

            lblResultado.setText(verificarVaga.verificacao());

        } catch (NumberFormatException e){
            lblResultado.setText("Insira uma idade válida");
        }
    }
}
