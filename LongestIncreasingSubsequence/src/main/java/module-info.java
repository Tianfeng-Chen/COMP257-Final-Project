module Util {
    requires javafx.controls;
    requires javafx.fxml;

    opens Util to javafx.fxml;
    exports Util;
}