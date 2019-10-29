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


}
