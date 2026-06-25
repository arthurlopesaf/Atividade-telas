package org.example.telinha;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Objects;

public class TelaPrincipalController {

    @FXML
    private Label txtTexto;

    @FXML
    private ImageView imgGaby;

    @FXML
    private ImageView imgGabyRosa;

    @FXML
    private Label contagemNumero;

    private int valorDoContador = 0;

    public void initialize() {

        contagemNumero.setText(String.valueOf(valorDoContador));
    }

    public void btnAparecerTexto(ActionEvent event) {

        txtTexto.setText("Oi gaby meu amor");

        Image imagemLocal = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/fotos/Gaby.jpeg")));
        imgGaby.setImage(imagemLocal);

        Image imagemLocal2 = new Image(Objects.requireNonNull(getClass().getResourceAsStream("/fotos/gabyrosa.png")));
        imgGabyRosa.setImage(imagemLocal2);

        valorDoContador++;

        contagemNumero.setText(String.valueOf(valorDoContador));
    }
}