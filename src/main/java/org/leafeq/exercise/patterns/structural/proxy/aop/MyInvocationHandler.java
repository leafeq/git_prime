package org.leafeq.exercise.patterns.structural.proxy.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler{

	//被代理的对象
	private Object target = null;
	
	//通过构造函数传递一个对象
	public MyInvocationHandler(Object _obj) {
		this.target = _obj;
	}
	
	//代理方法
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		return method.invoke(target, args);
	}

}
