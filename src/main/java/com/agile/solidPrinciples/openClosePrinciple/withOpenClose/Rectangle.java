package com.agile.solidPrinciples.openClosePrinciple.withOpenClose;

public class Rectangle implements Shape{
    double length;
    double breadth;
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public double calculateArea(){
        System.out.println("Calculating area of rectangle shape");
        return length * breadth;
    }
    
}