module org.example.atividade19 {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.atividade19 to javafx.fxml;
    exports org.example.atividade19;
}