module org.example.atividade18 {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.atividade18 to javafx.fxml;
    exports org.example.atividade18;
}