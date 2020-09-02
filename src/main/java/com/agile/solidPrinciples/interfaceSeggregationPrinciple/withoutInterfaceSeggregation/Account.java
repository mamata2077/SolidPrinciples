package com.agile.solidPrinciples.interfaceSeggregationPrinciple.withoutInterfaceSeggregation;

public interface Account {
    double getBalance();
    void processLocalPayment(double amount);
    void processInternationalPayment(double amount);    
}