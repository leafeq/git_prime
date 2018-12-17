package org.leafeq.util.collection;

import java.util.HashMap;
import java.util.Map;

public class HashTableExercise {

	int hash(Object key) {
		int h;
		return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
	}

	public void initial() {
		Map<Integer, String> map = new HashMap<>();
		for (int i = 0; i < 15 ; i++) {
			map.put(i, "abc");
		}

	}

	public static void main(String[] args) {
		HashTableExercise exercise =  new HashTableExercise();
		
		exercise.initial();
		
		
	}

}
