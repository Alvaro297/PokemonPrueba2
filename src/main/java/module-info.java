module com.example.demo6 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens com.example.demo6 to javafx.fxml;
    exports com.example.demo6;
}