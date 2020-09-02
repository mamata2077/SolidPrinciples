package com.agile.solidPrinciples.LiskovSubstitutionPrinciple.withLiskovSubstitution;

public class Bicycle extends DeviceWithoutEngine {
    @Override
    public void startMoving(){
        super.startMoving();
        System.out.println("Movement of cycle started");
    }
}