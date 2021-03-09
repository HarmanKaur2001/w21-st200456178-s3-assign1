package models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 *purpose:to test the student class
 * name:Harman Kaur
 * time:12:00pm
 * date: 2021
 */

public class StudentInterests {
    //private ArrayList<String>Interest;
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);//here the scanner is used

        //arraylist of unchartedInterests are created
        ArrayList<String> unchartedInterests = new ArrayList<>();
        unchartedInterests.addAll(Arrays.asList("riding","movies","travelling"));
        StudentCard interestsOfStudent = new StudentCard("Harman","Kaur",200456178,unchartedInterests);

        //now the first name, last name, student id and interests are printed
        System.out.println("First Name:" + interestsOfStudent.getFirstName());
        System.out.println("last Name:"  + interestsOfStudent.getLastName());
        System.out.println("Student ID:" + interestsOfStudent.getStudentId());
        System.out.println("Interests:"  + interestsOfStudent.getInterests());
    }
}


