package org.leafeq.exercise.patterns.structural.proxy.aop;

public class RealSubject implements Subject {

	//业务操作
	public void doSomething(String str) {
			System.out.println("do something!------>" + str);
	}

}
