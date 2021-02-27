package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import models.StudentCard;
import models.StudentInterests;

import javax.swing.text.html.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class StudentViewController implements Initializable {
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label studentIdLabel;

    @FXML
    private Label favoriteActivitiesLabel;

    @FXML
    private ImageView imageView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstNameLabel.setText("Harman");
        lastNameLabel.setText("Kaur");
        studentIdLabel.setText("200456178");
        favoriteActivitiesLabel.getLabelFor();
        imageView.getImage();

    }
}
