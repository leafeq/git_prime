package org.leafeq.exercise.test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HelloWorld {
	public static void main(String[] args) {
		BigDecimal dg1 = new BigDecimal("11");
		BigDecimal dg2 = dg1.add(new BigDecimal("23"));
		System.out.println(dg1.subtract(dg2));
	}
}
