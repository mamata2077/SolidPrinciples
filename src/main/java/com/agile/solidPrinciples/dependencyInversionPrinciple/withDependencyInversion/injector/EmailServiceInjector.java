package com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.injector;

import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.service.EmailServiceImpl;
import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.consumer.MyApplication;
import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.consumer.Consumer;

public class EmailServiceInjector implements MessageServiceInjector {

	
	public Consumer getConsumer() {
		return new MyApplication(new EmailServiceImpl());
	}

}