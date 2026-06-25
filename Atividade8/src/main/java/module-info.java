module com.example.atividade8 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade8 to javafx.fxml;
    exports com.example.atividade8;
}