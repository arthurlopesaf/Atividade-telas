module com.example.atividade5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.atividade5 to javafx.fxml;
    exports com.example.atividade5;
}