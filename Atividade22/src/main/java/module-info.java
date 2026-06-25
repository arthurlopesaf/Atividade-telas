module com.example.atividade22 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade22 to javafx.fxml;
    exports com.example.atividade22;
}