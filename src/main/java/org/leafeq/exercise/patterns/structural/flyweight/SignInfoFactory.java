package org.leafeq.exercise.patterns.structural.flyweight;

import java.util.HashMap;

//报考信息工厂
public class SignInfoFactory {
	
	//池对象
	private static HashMap<String, SignInfo> pool = new HashMap<String,SignInfo>();
	
	//报名信息的对象工厂
	public static SignInfo getSignInfo() {
		return new SignInfo();
	}
	
	public static SignInfo getSignInfo(String key) {
		SignInfo result = null;
		
		//池中没有该对象，则建立，并放入池中
		if(!pool.containsKey(key)) {
			System.out.println(key + "-----------建立对象，并放置到池中");
			result = new SignInfo4Pool(key);
			pool.put(key, result);
		}else {
			result = pool.get(key);
			System.out.println(key + "-----直接从池中获取");
		}
		return result;
		
	}
	
}
