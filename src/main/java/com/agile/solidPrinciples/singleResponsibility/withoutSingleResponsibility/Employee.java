package com.agile.solidPrinciples.singleResponsibility.withoutSingleResponsibility;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String address; 
    private Date dateOfJoining;
    public boolean isPromotionDueThisYear(){
      //promotion logic implementation
      return true;
    }
    public Double calcIncomeTaxForCurrentYear(){
      //income tax logic implementation
      Double income = 20000.78;
      return income;
    }
   public void setEmployeeId(String empId){
       this.employeeId = empId;
   }

   public String getEmployeeId(){
       return this.employeeId;
   }

   public void setEmployeeName(String empName){
       this.employeeName = empName;
   }

   public String getEmployeeName(){
       return this.employeeName;
   }

   public void setAddress(String address){
       this.address = address;
   }

   public String getAddress(){
       return this.address;
   }

   public void setDateOfJoining(Date doj){
       this.dateOfJoining = doj;
   }

   public Date getDateOfJoining(){
       return this.dateOfJoining;
   }
}