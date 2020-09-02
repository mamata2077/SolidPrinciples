package com.agile.solidPrinciples.interfaceSeggregationPrinciple.withInterfaceSeggregation;

public class SchoolAccount implements BaseAccount,LocalMoneyTransferCapability {
    double balance;
    public double getBalance(){
        //logic to return balance for school account
        return this.balance;
    }
    public void processLocalPayment(double amount){
        //logic to process local payment for school account
        System.out.println("local payemnt for school account done");
    }
    
}