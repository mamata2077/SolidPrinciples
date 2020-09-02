package com.agile.solidPrinciples.interfaceSeggregationPrinciple.withInterfaceSeggregation;

public class InternationalLoanService implements InternationalMoneyTransferCapability {
    public void processInternationalPayment(double amount){
        //implementtion logic goes here
        System.out.println("successfully processed international payment");
    }
}