module ca.georgian.comp1011assignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georgian.comp1011assignment1 to javafx.fxml;
    exports ca.georgian.comp1011assignment1;
}