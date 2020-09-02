package com.agile.solidPrinciples.openClosePrinciple.withoutOpenClose;

public class AreaCalculator {
public double calculateAreaForSquare(double size){
   Square square = new Square();
    return square.calculateArea(size);
}

public double calculateAreaForRectangle(double length, double breadth ){
    Rectangle rectagle = new Rectangle();
    return rectagle.calculateArea(length,breadth);
}

public static void main(String args[]){
    AreaCalculator calculator = new AreaCalculator();
    System.out.println("Calculating area of Square: "+ calculator.calculateAreaForSquare(10));
    System.out.println("Calculating area of Rectangle: "+ calculator.calculateAreaForRectangle(10,5));
}


}