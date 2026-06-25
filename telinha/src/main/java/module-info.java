module org.example.telinha {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.telinha to javafx.fxml;
    exports org.example.telinha;
}