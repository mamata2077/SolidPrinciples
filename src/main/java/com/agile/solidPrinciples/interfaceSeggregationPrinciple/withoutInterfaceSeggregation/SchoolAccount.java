package com.agile.solidPrinciples.interfaceSeggregationPrinciple.withoutInterfaceSeggregation;

public class SchoolAccount implements Account{
    double balance;
    public double getBalance(){
        //logic to return balance for school account
        return this.balance;
    }
    public void processLocalPayment(double amount){
        //logic to process local payment for school account
        System.out.println("local payemnt for school account done");
    }

    //empty implementation as international payemnt not in scope for school account
    public void processInternationalPayment(double amount){}
}