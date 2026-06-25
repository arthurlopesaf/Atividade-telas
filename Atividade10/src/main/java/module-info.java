module com.example.atividade10 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade10 to javafx.fxml;
    exports com.example.atividade10;
}