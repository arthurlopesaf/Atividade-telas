module org.example.projetinho1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.example.projetinho1 to javafx.fxml;
    exports org.example.projetinho1;
}