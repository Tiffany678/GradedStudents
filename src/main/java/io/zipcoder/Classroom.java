package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Classroom {
    Student[] students;
    int maxNumberOfStudents;
    public ArrayList<Student> stu;

    public Classroom (int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
        this.stu = new ArrayList<Student>(Arrays.asList(students));
    }
    public Classroom (Student[] students){

        this.stu = new ArrayList<Student>(Arrays.asList(students));
    }
    public Classroom (){
        this.students= new Student[30];
        this.stu = new ArrayList<Student>(Arrays.asList(students));
    }
    public Student[] getStudents() {

        return this.students;
    }
    public double getAverageExamScore(){
        double sum = 0.0;
        int numOfStudent =0;
        for(int i=0; i<students.length; i++){
            if(students[i]!=null){
            sum+=students[i].getAverageExamScore();
            numOfStudent++;
            }
        }
        return sum/numOfStudent;
    }
    public String addStudent(Student student){
        stu.add(student);
        String forthLine = "Student Name: "+ student.getFirstname()+" "+student.getLastName();
        double fiveLine = student.getAverageExamScore();
        String sixLine = student.getExamScores();

        return forthLine+ String.valueOf(fiveLine)+ sixLine;

    }
    public void removeStudent(String firstName, String lastName){
       for(int i=0; i<students.length; i++){
            if(students[i]!=null && students[i].getFirstname()==firstName && students[i].getLastName()==lastName){

                students[i]=null;

           }
        }
    }
    public Integer getGradeBook(){
        return 1;
    }
}
