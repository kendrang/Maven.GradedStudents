package io.zipcoder;

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
}
