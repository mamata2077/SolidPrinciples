package com.agile.solidPrinciples.LiskovSubstitutionPrinciple.withLiskovSubstitution;

public  class TransportationDevice
{
   String name;
   double speed;
   public String getName() {
       return name;
    }
   public void setName(String name){ 
       this.name = name;
    }
  
   public double getSpeed() {
       return speed;
    }
   void setSpeed(double speed) {
       this.speed = speed;
    }
}