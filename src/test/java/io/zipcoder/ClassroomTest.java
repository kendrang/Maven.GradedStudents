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

    @Test
    public void removeStudentTest() {

        // : Given
        int maxNumberOfStudents = 2;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScoresList = new ArrayList<>(Arrays.asList(100.0, 150.0, 250.0, 0.0 ));
        Student s1 = new Student("Leon", "Hunter", examScoresList);
        ArrayList<Double> examScoresList2 = new ArrayList<>(Arrays.asList(50.0, 100.0, 75.0, 45.0 ));
        Student s2 = new Student("Danny", "Devito", examScoresList2);

        // When
        classroom.addStudent(s1);
        classroom.addStudent(s2);
        Student[] preEnrollment = classroom.getStudents();
        classroom.removeStudent("Danny", "Devito");
        Student[] postEnrollment = classroom.getStudents();

        // Then
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);


    }

    @Test
    public void getStudentsByScore (){

        // : Given
        int maxNumberOfStudents = 3;
        Classroom classroom = new Classroom(maxNumberOfStudents);
        ArrayList<Double> examScoresList = new ArrayList<>(Arrays.asList(50.0 ));
        Student s1 = new Student("Beeg", "Chungus", examScoresList);
        ArrayList<Double> examScoresList2 = new ArrayList<>(Arrays.asList(100.0 ));
        Student s2 = new Student("Leon", "Hunter", examScoresList2);
        ArrayList<Double> examScoresList3 = new ArrayList<>(Arrays.asList(20.0 ));
        Student s3 = new Student("Danny", "Devito", examScoresList3);

        // When
        classroom.addStudent(s1);
        classroom.addStudent(s2);
        classroom.addStudent(s3);
        Student[] preEnrollment = classroom.getStudents();
        String preEnrollmentAsString = Arrays.toString(preEnrollment);
        classroom.getStudentsByScore();
        Student[] postEnrollment = classroom.getStudents();

        // Then

        String postEnrollmentAsString = Arrays.toString(postEnrollment);

        System.out.println("===========================");
        System.out.println(preEnrollmentAsString);
        System.out.println("===========================");
        System.out.println(postEnrollmentAsString);


    }
}
