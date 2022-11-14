package com.keyin.qap3.problem2;

public class Square extends Rectangle{

    // Constructors
    public Square(){
        super();
    }

    public Square(double side){
        super(side, side);
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    // Getters and Setters
    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side){
        setSide(side);
    }

    @Override
    public String toString(){
        return "A Square with side = " + this.getSide() + ", which is a subclass of " + super.toString();
    }
}
