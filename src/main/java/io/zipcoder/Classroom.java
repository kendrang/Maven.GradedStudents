package io.zipcoder;

import java.lang.reflect.Array;
import java.util.*;

public class Classroom {


    Student[] students;
    int maxNumberOfStudents;

    public Classroom (int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];

    }

    public Classroom(Student[]students){
        this.students= students;

    }

    public Classroom (){
        students = new Student[30];
    }
    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScore() {
        Double addedScores = 0.0;
        for (int i = 0; i < students.length; i++) {

            addedScores += students[i].getAverageExamScore();
        }
        return addedScores / students.length;
    }

    public void addStudent(Student newStudent){
        for (int i =0 ; i < this.students.length ; i++){
            if (this.students[i] == null){
                this.students[i] = newStudent;
                break;
            }

        }

    }
    public void removeStudent (String firstName, String lastName){
        int counter =0;
        Student[] removedStudentArr = new Student[students.length- counter];
        for (int i=0 ; i <students.length ; i++){
            if (students[i].firstName + students[i].lastName != firstName + lastName){
                counter +=1;
            }
        }
        for (int j=0 ; j < removedStudentArr.length ; j++){
            if (students[j].firstName + students[j].lastName != firstName + lastName)
            removedStudentArr[j] = students[j];
        }

    }

    public void getStudentsByScore (){
        Student[] scoresArr = new Student[students.length];
        for (int i=0 ; i <students.length-1; i ++){
            for (int j=i+1; j <students.length ; j++){
                if (students[i].getAverageExamScore().compareTo(students[j].getAverageExamScore())<0){
                    Student temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;


                }

            }


        }


    }
    public void getGradeBook() {
        Map<String, ArrayList<Student>> gradeBook= new TreeMap<>();

        gradeBook.put("A", new ArrayList<Student>());
        gradeBook.put("B", new ArrayList<Student>());
        gradeBook.put("C", new ArrayList<Student>());
        gradeBook.put("D", new ArrayList<Student>());
        gradeBook.put("F", new ArrayList<Student>());

        for (int i=0 ; i <students.length; i++){

            if(students[i].getAverageExamScore() >= 90.0){
                gradeBook.get("A").add(students[i]);

            }
            if(students[i].getAverageExamScore() >= 80.0) {
                gradeBook.get("B").add(students[i]);
            }
            if(students[i].getAverageExamScore() >= 70.0) {
                gradeBook.get("C").add(students[i]);
            }
            if(students[i].getAverageExamScore() >= 60.0) {
                gradeBook.get("D").add(students[i]);
            }
            if(students[i].getAverageExamScore() < 60.0) {
                gradeBook.get("F").add(students[i]);
            }
        }

    }
}

