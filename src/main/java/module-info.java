module com.example.sport {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.sport to javafx.fxml;
    exports com.example.sport;
}