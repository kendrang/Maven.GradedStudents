package io.zipcoder;

import java.util.ArrayList;

public class Student {

    String firstName = "";
    String lastName = "";
    ArrayList<Double> examScores ;

    public Student (String firstName , String lastName, ArrayList<Double> examScores ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScores = examScores;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExamScores() {
        String printedScores = "";
        for (int i= 0; i<examScores.size(); i++ ){
            printedScores +=  "\n\t Exam" + i + "-> " + examScores.get(i);
        }

        return "Exam Scores: \n" + printedScores;
    }

    public Integer getNumberOfExamsTaken(){
        return examScores.size();
    }

    public void addExamScore(Double examScoreAdded) {
        this.examScores.add(examScoreAdded);

    }
    public void setExamScore(int examNumber, double newScore){
        examScores.add(examNumber,newScore);
    }

    public Double getAverageExamScore() {
        Double addedScores= 0.0;
        for(int i =0; i < examScores.size(); i++){

            addedScores += examScores.get(i);
        }
        return addedScores/examScores.size();
    }
    public String toString() {

        return "Student Name: " + firstName + lastName + "\n> Average Score: " + getAverageExamScore() +
                getExamScores();
    }

}
