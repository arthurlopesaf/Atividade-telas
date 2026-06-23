module com.example.atividade13 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade13 to javafx.fxml;
    exports com.example.atividade13;
}