package org.example.otp2homeassigment2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.ResourceBundle;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import java.util.Locale;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController {
    public Button button1;

    public Button button2;

    public Button button3;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");

    }
    public void initialize() {
//        ResourceBundle bundle = ResourceBundle.getBundle("bundle2");
//        button1.setText(bundle.getString("button1.text"));
//        button2.setText(bundle.getString("button2.text"));
//        button3.setText(bundle.getString("button3.text"));
    }

    public void setEN(ActionEvent actionEvent) throws IOException {
        Locale l = new Locale("en", "UK");
        loadView(l);
    }

    public void setIR(ActionEvent actionEvent) throws IOException {
        Locale l = new Locale("fa", "IR");
        loadView(l);
    }

    public void setJP(ActionEvent actionEvent) throws IOException {
        Locale l = new Locale("ja", "JP");
        loadView(l);
    }

    public void loadView(Locale locale) {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        fxmlLoader.setResources(ResourceBundle.getBundle("bundle", locale));
        try {
            Parent root = fxmlLoader.load();
            Stage s = (Stage) button1.getScene().getWindow();
            s.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}