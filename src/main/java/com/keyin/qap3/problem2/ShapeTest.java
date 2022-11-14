package com.keyin.qap3.problem2;

public class ShapeTest {

    // Program to test all methods defined in Shape
    public static void main(String[] args) {
        // Test Case One - Default Constructor
        Shape sTest1 = new Shape();

        System.out.println("Test Case One - Default Constructor");
        // Printing original values
        System.out.println(sTest1.toString());
        System.out.println("Shape Color is: " + sTest1.getColor());
        System.out.println("Shape is Filled: " + sTest1.isFilled());

        // Changing Values
        sTest1.setColor("blue");
        sTest1.setFilled(false);

        // Printing changed values
        System.out.println("Updated - Shape Color is: " + sTest1.getColor());
        System.out.println("Updated - Shape is Filled: " + sTest1.isFilled());

        // Test Case Two - Constructor with passed in values
        System.out.println();
        System.out.println("Test Case Two - Constructor with passed in values");

        Shape sTest2 = new Shape("purple", false);

        // Printing original values
        System.out.println(sTest2.toString());
        System.out.println("Shape Color is: " + sTest1.getColor());
        System.out.println("Shape is Filled: " + sTest1.isFilled());

        // Changing Values
        sTest1.setColor("blue");
        sTest1.setFilled(false);

        // Printing changed values
        System.out.println("Updated - Shape Color is: " + sTest1.getColor());
        System.out.println("Updated - Shape is Filled: " + sTest1.isFilled());

    }
}
