module olamundo.olamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens olamundo.olamundojavafx to javafx.fxml;
    exports olamundo.olamundojavafx;
}
