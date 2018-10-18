package org.leafeq.exercise.algorithm;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> targetList = new ArrayList<>();
		
		for(int i=0;i<1000;i++) {
			list1.add(i + "a");
			list2.add(i + "b");
		}
		
		Long startTime = System.currentTimeMillis();
		
		for(String first: list1) {
			for(String next: list2){
				
				targetList.add(first);
				boolean resCompare = first.equals(next);
				if(!resCompare) {
					targetList.add(next);
				}
			}
		}
		
		
		System.out.println(targetList.size());
		
		Long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
	
}
