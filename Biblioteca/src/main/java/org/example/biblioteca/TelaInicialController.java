package org.example.biblioteca;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class TelaInicialController {

    @FXML
    private AnchorPane TelaInicial;

    @FXML
    private AnchorPane MenuPrincipal;

    public void btnMenuPrincipal(ActionEvent event) {

        TelaInicial.setVisible(false);
        MenuPrincipal.setVisible(true);

    }
}
