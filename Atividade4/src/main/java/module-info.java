module com.example.atividade4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade4 to javafx.fxml;
    exports com.example.atividade4;
}