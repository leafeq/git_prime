package org.leafeq.exercise.patterns.structural.adapter.classadapter;

public class Clienter {
	public static void main(String[] args) {
		Ps2 p = new Adapter();
		p.isPs2();
	}
}
