module com.example.atividade14 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade14 to javafx.fxml;
    exports com.example.atividade14;
}