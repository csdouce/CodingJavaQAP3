package com.keyin.qap3.problem1;

public class CollegeStudent extends Student{
    // Instance Variables
    protected String studentMajor;      // eg Electrical Engineering, Communications or Undeclared
    protected int schoolYear;           // eg FROSH = 1, SOPH = 2

    // Constructors
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year){
        super(name, age, gender, idNum, gpa);
        this.studentMajor = major;
        this.schoolYear = year;
    }

    @Override
    public String toString() {
        return super.toString() + " CollegeStudent{" +
                "studentMajor='" + studentMajor + '\'' +
                ", schoolYear=" + schoolYear +
                '}';
    }

    // Getters and Setters
    public String getStudentMajor() {
        return studentMajor;
    }

    public void setStudentMajor(String studentMajor) {
        this.studentMajor = studentMajor;
    }

    public int getSchoolYear() {
        return schoolYear;
    }

    public void setSchoolYear(int schoolYear) {
        this.schoolYear = schoolYear;
    }
}
