package com.agile.solidPrinciples.openClosePrinciple.withOpenClose;

public class AreaCalculator {
    public double calculateArea(Shape s){
       return s.calculateArea();
    }

public static void main(String args[]){
    Shape s = new Rectangle(10,5);
    System.out.println("Rectangle Area: "+ s.calculateArea());

    s = new Square(10);
    System.out.println("Square area: "+s.calculateArea());
}
}