package models;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.*;

/*purpose of the class: to add first name, last name, student id and interests
 *name: harman kaur
 * date:2021-02-09
 * time:10:30 am
 */
public class StudentCard {
    /**
     * this class has first name , last name , student id and interests which we take getter and setter
     */
    private String firstName;//firstname is taken as string
    private String lastName;//last name is taken as string
    private int studentId;//studentId is taken as integer
    private ArrayList<String> interests;//interests are taken as array list type string
    private Image studentImage;

    public StudentCard(String firstName, String lastName, int studentId, ArrayList<String> interests)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setStudentId(studentId);
        setInterests(interests);
        setStudentImage();
    }


    //here the getter and setter method is put for first name, last name, student id and interests
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName) {
        String firstName1= firstName;
        String conversion= firstName1.substring(0,1).toUpperCase();
        System.out.println(conversion);

        if (firstName.length()>=2)
            this.firstName = firstName;
        else
            throw new IllegalArgumentException(firstName + "is not valid. chose from these"+ firstName);
    }

    private void setStudentImage()
    {
        String filePath = String.format("image/harman.jpg",firstName, lastName, studentId,interests);
       // System.out.println(filePath);
        studentImage = new Image(filePath);
    }

    public Image getStudentImage() {
        return studentImage  ;
    }

    public void setLastName(String lastName){
        String lastName1 = lastName;
        String conversion= lastName1.substring(0,1).toUpperCase();
        System.out.println(conversion);
        lastName = lastName.trim();
        if (lastName.length() >= 2) {
            this.lastName = lastName;
        }
            else
            throw new IllegalArgumentException(lastName + "has no rule to use upper case" + lastName);
    }

    public void setStudentId(int studentId){
        //student id is to be validated
        int min = 1000000000;
        int max = 999999999;
        if (studentId>=min && studentId <=max)
            this.studentId = studentId;
        else
            throw new InputMismatchException(studentId +"has no chars"+ studentId);
    }

    //getter for the last name
    public String getLastName() {
        return lastName;
    }

    //getter for the student id
    public int getStudentId() {
        return studentId;
    }

    //getter for the interests
    public ArrayList<String> getInterests() {
        return interests;
    }

    //interests are write under array list
    public void setInterests(ArrayList<String> interests) {
        List<String> validInterests = Arrays.asList("riding","movies","travelling","skiing","dancing","gaming","reading");
        for (int i =0;i<interests.size();i++) {
            if (validInterests.contains(interests.get(i)))//case sensitive comparison
                this.interests = interests;
            else
                throw new IllegalArgumentException(interests + " " + "is not valid. use one of them" + validInterests);
        }
    }

    //here the theme for the interests are used where we get to know that interests are horrific or interesting

}


