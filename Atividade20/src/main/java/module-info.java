module com.example.atividade20 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade20 to javafx.fxml;
    exports com.example.atividade20;
}