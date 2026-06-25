module com.example.atividade7 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade7 to javafx.fxml;
    exports com.example.atividade7;
}