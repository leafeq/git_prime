package org.leafeq.exercise.patterns.structural.flyweight;

public class SignInfo4Pool extends SignInfo{
	
	//定义一个对象池提取的key值
	private String key;
	
	public SignInfo4Pool(String _key) {
		this.key = _key;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
}
