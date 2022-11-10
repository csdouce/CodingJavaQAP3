package com.keyin.qap3.problem1;

public class Student extends Person{
    // Instance Variables
    protected String myIdNum;       //Student Id Number
    protected double myGPA;         //Grade Point Avg

    // Constructors
    public Student(String name, int age, String gender, String idNum, double gpa){
        super(name, age, gender);
        this.myIdNum = idNum;
        this.myGPA = gpa;
    }

    @Override
    public String toString() {
        return super.toString() + " Student " +
                "myIdNum='" + myIdNum + '\'' +
                ", myGPA=" + myGPA +
                '}';
    }

    // Getters and Setters
    public String getMyIdNum() {
        return myIdNum;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }
}
