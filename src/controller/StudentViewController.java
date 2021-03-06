package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Orientation;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.ImageView;
import models.StudentCard;
import models.StudentInterests;
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
    @FXML
    private ScrollBar scrollBar;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        firstNameLabel.setText("Harman");
        lastNameLabel.setText("Kaur");
        studentIdLabel.setText("200456178");
        favoriteActivitiesLabel.getLabelFor();
        imageView.getImage();
        scrollBar.adjustValue(10);

    }
}


