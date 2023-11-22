module com.example.ekhant_javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.ekhant_javafx to javafx.fxml;
    exports com.example.ekhant_javafx;
}