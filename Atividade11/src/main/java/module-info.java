module com.example.atividade11 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade11 to javafx.fxml;
    exports com.example.atividade11;
}