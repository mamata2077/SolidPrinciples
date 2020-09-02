package com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.injector;

import com.agile.solidPrinciples.dependencyInversionPrinciple.withDependencyInversion.consumer.Consumer;

public interface MessageServiceInjector {

	public Consumer getConsumer();
}