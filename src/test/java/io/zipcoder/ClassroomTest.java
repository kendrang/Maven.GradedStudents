package io.zipcoder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ClassroomTest {
    @Test
    public void getAverageScoreTest(){
        // : Given
        Double[] s1Scores = { 100.0, 150.0 };
        ArrayList<Double> s1ScoresList = new ArrayList<>(Arrays.asList(s1Scores));
        Double[] s2Scores = { 225.0, 25.0 };
        ArrayList<Double> s2ScoresList = new ArrayList<>(Arrays.asList(s2Scores));

        Student s1 = new Student("student", "one", s1ScoresList);
        Student s2 = new Student("student", "two", s2ScoresList);

        Student[] students = {s1,s2};
        Classroom classroom = new Classroom(students);

        // When
        double output = classroom.getAverageExamScore();

        // Then
        System.out.println(output);

    }

    @Test
    public void addStudentTest(){

        // : Given
        int maxNumberOfStudents = 1;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScoresList = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0 ));
        Student s1 = new Student("Leon", "Hunter", examScoresList);

        // When
        Student[] preEnrollment = classroom.getStudents();
        classroom.addStudent(s1);
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);
    }

}
