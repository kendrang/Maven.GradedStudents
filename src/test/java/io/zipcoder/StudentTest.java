package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentTest {

    @Test
public void getScoresTest () {
        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 95.0, 123.0, 96.0));
        Student student = new Student(firstName, lastName, examScores);

// When
        String output = student.getExamScores();

// Then
        System.out.println(output);
    }

    @Test
    public void getAverageScoreTest() {

        // : Given
        String firstName = "Leon";
        String lastName = "Hunter";
        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 100.0, 100.0, 100.0));
        Student student = new Student(firstName, lastName, examScores);

// When
        Double actual = (Double)student.getAverageExamScore();

// Then
        Assert.assertEquals(100.00, actual,.00);
    }

//    @Test
//    public void toStringTest() {
//        // : Given
//        String firstName = "Leon";
//        String lastName = "Hunter";
//        ArrayList<Double> examScores = new ArrayList<Double>(Arrays.asList(100.0, 100.0, 100.0, 100.0));
//        Student student = new Student(firstName, lastName, examScores);
//
//// When
//        String actual = student.toString();
//        System.out.println(student.toString());
//        String expected = "Student Name: " + "Leon" + " Hunter"+ "\n> Average Score: " + "100.0" +"\n" +"Exam Scores:"+
//                "\n\tExam0-> 100.0 \n\tExam1-> 100.0 \n\tExam2-> 100.0 \n\tExam3-> 100.0 ";
//        System.out.println(expected);
//
//// Then
//        Assert.assertEquals(expected,actual); }

    }

