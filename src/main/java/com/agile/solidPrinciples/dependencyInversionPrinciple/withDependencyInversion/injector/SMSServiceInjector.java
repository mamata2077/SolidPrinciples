package com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.injector;

import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.service.SMSServiceImpl;
import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.consumer.Consumer;
import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.consumer.MyApplication;
public class SMSServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyApplication(new SMSServiceImpl());
	}

}