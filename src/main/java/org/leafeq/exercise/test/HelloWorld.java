package org.leafeq.exercise.test;

import java.math.BigDecimal;

public class HelloWorld {
	public static void main(String[] args) {
		BigDecimal d1 = null;
		BigDecimal decimal = new BigDecimal("234");
		d1 = decimal;
		BigDecimal d2 = d1.add(new BigDecimal("159"));
		System.out.println(d2);
	}
}
