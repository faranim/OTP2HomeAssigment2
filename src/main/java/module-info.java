module org.example.otp2homeassigment2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.otp2homeassigment2 to javafx.fxml;
    exports org.example.otp2homeassigment2;
}