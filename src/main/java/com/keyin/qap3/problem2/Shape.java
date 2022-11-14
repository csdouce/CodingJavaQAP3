package com.keyin.qap3.problem2;

public class Shape {
    // Instance Variables
    private String color;
    private boolean filled;

    // Constructors
    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String toString() {
        String filledText;

        if(this.filled == true){
            filledText = "filled";
        } else {
            filledText = "not filled";
        }

        return "A Shape with color of " + this.color + " and " + filledText;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
