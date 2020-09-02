package com.agile.solidPrinciples.LiskovSubstitutionPrinciple.withLiskovSubstitution;

public class Car extends DeviceWithEngine{
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Starting engine of car");
    }
}