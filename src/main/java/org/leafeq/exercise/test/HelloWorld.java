package org.leafeq.exercise.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld {
	public static void main(String[] args) {
		Map<String,String> map = new HashMap<String, String>();
		for(int i=0; i<15; i++) {
			map.put("key" + i, i+"");
		}
		
		System.out.println(map.size());
		
		
	}
}
