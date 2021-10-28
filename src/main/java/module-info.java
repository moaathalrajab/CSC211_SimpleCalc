module com.mycompany.week9_simplecalc_demo {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.week9_simplecalc_demo to javafx.fxml;
    exports com.mycompany.week9_simplecalc_demo;
}
