package com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion;

import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.consumer.Consumer;
import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.injector.EmailServiceInjector;
import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.injector.MessageServiceInjector;
import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.injector.SMSServiceInjector;

public class MyApplicationMain {
    public static void main(String[] args) {
		String msg = "Hi Mamata";
		String email = "mamata@abc.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer consumer = null;
		
		//Send email
		injector = new EmailServiceInjector();
		consumer = injector.getConsumer();
		consumer.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		consumer = injector.getConsumer();
		consumer.processMessages(msg, phone);
	}

}