package com.agile.solidPrinciples.LiskovSubstitutionPrinciple.withoutLiskovSubstitution;

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
   
   
   public  void startEngine(){
       System.out.println("Engine starting functionality");
   };
}