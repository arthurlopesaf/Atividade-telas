module com.example.atividade6 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade6 to javafx.fxml;
    exports com.example.atividade6;
}