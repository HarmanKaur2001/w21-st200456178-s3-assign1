package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label studentIdLabel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstNameLabel.setText("Harman");
        lastNameLabel.setText("Kaur");
        studentIdLabel.setText("200456178");
    }
}
