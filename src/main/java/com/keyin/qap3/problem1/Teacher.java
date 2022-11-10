package com.keyin.qap3.problem1;

public class Teacher extends Person{
    // Instance Variables
    protected String classSubject;      // Subject they teach
    protected double annualSalary;      // Their annual Salary

    // Constructors
    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        this.classSubject = subject;
        this.annualSalary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " Teacher{" +
                "classSubject='" + classSubject + '\'' +
                ", annualSalary=" + annualSalary +
                '}';
    }

    // Getters and Setters
    public String getClassSubject() {
        return classSubject;
    }

    public void setClassSubject(String classSubject) {
        this.classSubject = classSubject;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
