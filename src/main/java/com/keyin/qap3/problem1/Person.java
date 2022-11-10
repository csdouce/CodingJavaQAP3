// Advanced Programming - Java QAP3
// Developer: Chris Doucette
// Date Created: Wednesday November 9, 2022

package com.keyin.qap3.problem1;

public class Person {
    // Instance Variables
    protected String myName;        //Name of the person
    protected int myAge;            //Person's Age
    protected String myGender;      // "M" for Male, "F" for Female

    // Constructors
    public Person(String name, int age, String gender){
        this.myName = name;
        this.myAge = age;
        this.myGender = gender;
    }

    public String toString(){
        return myName + ", age: " + myAge + ", gender: " + myGender;
    }

    // Getters and Setters

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }
}
