package com.agile.solidPrinciples.singleResponsibility.withSingleResponsibility;

import java.util.Date;

public class Employee {
    private String employeeId;
    private String employeeName;
    private String address; 
    private Date dateOfJoining;
   
    
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