package com.agile.solidPrinciples.dependencyInversionPrinciple.withoutDependencyInversion;

public class MyApplicationMain {
 
	public static void main(String[] args) {
		MyApplication app = new MyApplication();
		app.processMessages("Hi Mamata", "testMail@abc.com");
	}

}
    
