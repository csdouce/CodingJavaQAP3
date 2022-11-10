package com.keyin.qap3.problem1;

public class Demo {

    public static void main(String[] args){
        // Test 1
        System.out.println("Test Case 1 - Person");
        Person jerry = new Person("Jerry Jones", 78, "M");
        System.out.println(jerry);

        // Test 2
        System.out.println();
        System.out.println("Test Case 2 - Student");
        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println(lynne);

        // Test 3
        System.out.println();
        System.out.println("Test Case 3 - Teacher");
        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println(mrJava);

        // Test 4
        System.out.println();
        System.out.println("Test Case 4 - College Student");
        CollegeStudent irma = new CollegeStudent("Irma Frosh", 18, "F", "UCB123", 4.0, "English", 1);
        System.out.println(irma);

    }
}
