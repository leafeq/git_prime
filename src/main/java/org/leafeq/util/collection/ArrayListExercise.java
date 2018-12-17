package org.leafeq.util.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExercise {

	public void initial() {
		List<String> list = new ArrayList<>();
		for (int i = 0; i < 9; i++) {
			list.add("" + i);
		}
	}

	public static void main(String[] args) {
		ArrayListExercise list = new ArrayListExercise();
		list.initial();
	}
}
