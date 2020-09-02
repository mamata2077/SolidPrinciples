package com.agile.solidPrinciples.interfaceSeggregationPrinciple.withoutInterfaceSeggregation;

public class InternationalLoanService implements Account {
    public double getBalance(){
        //Not required but implemented 
        return 0;
    }
    //empty implementation
    public void processLocalPayment(double amount){}
    
    public void processInternationalPayment(double amount){
        //implementtion logic goes here
        System.out.println("successfully processed international payment");
    }
}