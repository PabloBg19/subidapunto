module org.example.cunning_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.cunning_javafx to javafx.fxml;
    exports org.example.cunning_javafx;
}