package com.keyin.qap3.problem2;

public class Circle extends Shape{
    // Instance variables
    private double radius;

    // Constructors
    public Circle(){
        super();
        this.radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "A Circle with radius = " + this.radius + ", which is a subclass of " + super.toString();
    }

    // Getters and Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Custom Methods
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2 * Math.PI * this.radius;
    }
}
