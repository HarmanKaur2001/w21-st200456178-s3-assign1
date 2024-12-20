package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import javafx.scene.image.ImageView;
import models.StudentCard;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static javafx.scene.control.SelectionMode.*;
/**
 * purpose of the class: to add first name, last name, student id and interests
 *name: harman kaur
 * date:2021-02-09
 * time:10:30 am
 */

public class StudentViewController implements Initializable {

    //add the fxml files and view on screen
    @FXML
    private Label firstNameLabel;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label studentIdLabel;

    @FXML
    private ImageView imageView;



    @FXML
    private ListView<String> listView;
    ObservableList<String> list = FXCollections.observableArrayList("Hiking","riding","movies","travelling","skiing","dancing","gaming","reading");


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ArrayList<String> unchartedInterests = new ArrayList<>();


        StudentCard studentCard = new StudentCard("Harman", "Kaur", 200456178, unchartedInterests);
        firstNameLabel.setText(studentCard.getFirstName());
        lastNameLabel.setText(studentCard.getLastName());
        studentIdLabel.setText(Integer.toString(studentCard.getStudentId()));
        imageView.setImage(studentCard.getStudentImage());
        listView.setItems(list);
        listView.getSelectionModel().setSelectionMode(MULTIPLE);

    }
}


