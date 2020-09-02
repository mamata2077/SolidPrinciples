package com.agile.solidPrinciples.openClosePrinciple.withOpenClose;

public class Square implements Shape{
    double length;
    public Square(double length){
        this.length = length;
    }

    public double calculateArea(){
        System.out.println("Calculating area of square shape");
        return length * length;
    }
    
}