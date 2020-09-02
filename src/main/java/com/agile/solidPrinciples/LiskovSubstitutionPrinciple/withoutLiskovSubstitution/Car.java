package com.agile.solidPrinciples.LiskovSubstitutionPrinciple.withoutLiskovSubstitution;

public class Car extends TransportationDevice{
    @Override
    public void startEngine(){
        super.startEngine();
        System.out.println("Engine of car started");
    }
}