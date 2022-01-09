module correlation {
  requires javafx.controls;
  requires javafx.fxml;

  opens com.michowski to javafx.fxml;

  exports com.michowski;
}
