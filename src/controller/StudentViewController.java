package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.ScrollBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import models.StudentCard;

import java.net.URL;
import java.util.ArrayList;
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
        ArrayList<String> unchartedInterests = new ArrayList<>();
        StudentCard studentCard = new StudentCard("Harman", "Kaur", 200456178, unchartedInterests);
        firstNameLabel.setText(studentCard.getFirstName());
        lastNameLabel.setText(studentCard.getLastName());
        studentIdLabel.setText(Integer.toString(studentCard.getStudentId()));
       // favoriteActivitiesLabel.getLabelFor(studentCard.getInterests());
        imageView.setImage(studentCard.getStudentImage());
        scrollBar.adjustValue(10);

    }
}


