package com.agile.solidPrinciples.LiskovSubstitutionPrinciple.withLiskovSubstitution;

public class DeviceWithoutEngine extends TransportationDevice {
    public void startMoving(){
        System.out.println("Basic functionality of moving for device without engine");
    }
}