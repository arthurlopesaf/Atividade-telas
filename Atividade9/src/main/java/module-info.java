module com.example.atividade9 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade9 to javafx.fxml;
    exports com.example.atividade9;
}