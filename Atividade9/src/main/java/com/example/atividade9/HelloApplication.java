package com.example.atividade9;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TelaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 350, 420);
        stage.setTitle("Três Números em Ordem Decrescente");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
