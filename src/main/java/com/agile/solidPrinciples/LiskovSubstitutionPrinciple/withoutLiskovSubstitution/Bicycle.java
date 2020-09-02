package com.agile.solidPrinciples.LiskovSubstitutionPrinciple.withoutLiskovSubstitution;

public class Bicycle extends TransportationDevice{
    @Override
    public void startEngine(){
        //cant implement this method as there is no Engine in bicycle
    };
   
    //need to add new method for bicycle
    public void startMovement(){
        System.out.println("Movement of bicycle started");
    }
    
}