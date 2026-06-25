module com.example.atividade15 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade15 to javafx.fxml;
    exports com.example.atividade15;
}