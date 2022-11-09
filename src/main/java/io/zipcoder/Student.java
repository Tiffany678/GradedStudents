package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class Student {
    private String firstname;
    private String lastName;
    private ArrayList<Double> examSoures;


    public Student(String firstName, String lastname, Double[] testScores){
        this.firstname = firstName;
        this.lastName = lastname;
        this.examSoures = new ArrayList<>(Arrays.asList(testScores));
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNumberOfExamsTaken() {
        return this.examSoures.size();
    }

    public ArrayList<Double> getExamSoures() {
        return this.examSoures;
    }
    public String getExamScores(){
        String examScore ="Exam Scores: \n";
        String exam="";
        for(int i=0; i<examSoures.size(); i++ ){
            exam +="\tExam "+(i+1)+" -> "+examSoures.get(i)+"\n";
        }
        return examScore+exam;
    }
    public void addExamScore(double examScore){
        this.examSoures.add(examScore);
    }
    public void setExamScore(int examNumber, double newScore){
      examSoures.set(examNumber, newScore);
    }
    public double getAverageExamScore(){
       double sum =0;
       for(int i=0; i<examSoures.size(); i++){
           sum+=examSoures.get(i);
       }
       return sum/examSoures.size();
    }
}
