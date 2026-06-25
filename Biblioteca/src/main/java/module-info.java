module org.example.biblioteca {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.biblioteca to javafx.fxml;
    exports org.example.biblioteca;
}