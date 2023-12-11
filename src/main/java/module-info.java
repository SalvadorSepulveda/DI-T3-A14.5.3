module es.ieslosmontecillos.tooltijavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.tooltijavafx to javafx.fxml;
    exports es.ieslosmontecillos.tooltijavafx;
}