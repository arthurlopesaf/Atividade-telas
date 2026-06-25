package com.example.atividade2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TelaPrincipalController {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNomeDoAluno;

    @FXML
    private TextField txtNota1;

    @FXML
    private TextField txtNota2;

    @FXML
    private TextField txtNota3;

    @FXML
    public void btnCalcularNota(ActionEvent actionEvent) {

        try {
            double nota1 = Double.parseDouble(txtNota1.getText());
            double nota2 = Double.parseDouble(txtNota2.getText());
            double nota3 = Double.parseDouble(txtNota3.getText());

            double media = (nota1 + nota2 + nota3) / 3;
            String nomeDoAluno = txtNomeDoAluno.getText();

            if (media >= 7) {
                lblResultado.setText(nomeDoAluno + " - Média: " + String.format("%.2f", media) + " - Aprovado");
            } else {
                lblResultado.setText(nomeDoAluno + " - Média: " + String.format("%.2f", media) + " - Reprovado");
            }

        } catch (NumberFormatException e) {
            lblResultado.setText("Digite apenas números nas notas");
        }
    }
}