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
}
