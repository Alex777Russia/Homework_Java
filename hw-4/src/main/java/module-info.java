module com.example.homework_4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.homework_4 to javafx.fxml;
    exports com.example.homework_4;
}