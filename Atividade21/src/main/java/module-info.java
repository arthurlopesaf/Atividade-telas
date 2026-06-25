module com.example.atividade21 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade21 to javafx.fxml;
    exports com.example.atividade21;
}