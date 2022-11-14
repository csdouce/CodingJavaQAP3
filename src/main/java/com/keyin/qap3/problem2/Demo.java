package com.keyin.qap3.problem2;

public class Demo {

    public static void main(String[] args){
        // Creating instances of Shape, Circle, Rectangle & Square
        Shape S = new Shape("Red", true);

        Circle C = new Circle(5.0);
        Circle C1 = new Circle( 5.0, "blue", true);

        Rectangle R = new Rectangle(2.0, 3.0);
        Rectangle R1 = new Rectangle(2.0, 3.0, "green", false);

        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0, "yellow", true);

        // Printing to Screen

        // Printing C.getArea() & C.getPerimeter()
        System.out.println(S.toString());
        System.out.println(C.toString());

        System.out.println("Area of C: " + C.getArea());
        System.out.println("Perimeter of C: " + C.getPerimeter() );

        // Printing the C1.getArea() & C1.getPerimter()
        System.out.println();
        System.out.println(C1.toString());

        System.out.println("Area of C1: " + C1.getArea());
        System.out.println("Perimeter of C1: " + C1.getPerimeter());

        // Printing R.getArea() and R.getPerimeter
        System.out.println();
        System.out.println(R.toString());
        System.out.println("Area of R: " + R.getArea());
        System.out.println("Perimeter of R: " + R.getPerimeter());

        // Printing R1.getArea & R1.getPerimeter
        System.out.println();
        System.out.println(R1.toString());
        System.out.println("Area of R1: " + R1.getArea());
        System.out.println("Perimeter of R1: " + R1.getPerimeter());

        // Printing Sq.getArea() & Sq.getPerimeter()
        System.out.println();
        System.out.println(Sq.toString());
        System.out.println("Area of Sq: " + Sq.getArea());
        System.out.println("Perimeter of Sq: " + Sq.getPerimeter());

        // Printing Sq1.getArea() & Sq1.getPerimeter()
        System.out.println();
        System.out.println(Sq1.toString());
        System.out.println("Area of Sq1: " + Sq1.getArea());
        System.out.println("Perimeter of Sq1: " + Sq1.getPerimeter());
    }
}
