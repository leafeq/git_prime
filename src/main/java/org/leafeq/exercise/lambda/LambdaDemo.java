package org.leafeq.exercise.lambda;

public class LambdaDemo {
	public static void main(String[] args) {
		MyNumber myNumber;

		myNumber = () -> 123.45;

		System.out.println(myNumber.getValue());

		myNumber = () -> Math.random() * 23;

		System.out.println(myNumber.getValue());

	}
}
