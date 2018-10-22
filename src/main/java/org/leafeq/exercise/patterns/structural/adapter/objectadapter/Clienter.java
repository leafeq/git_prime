package org.leafeq.exercise.patterns.structural.adapter.objectadapter;

public class Clienter {
	public static void main(String[] args) {
		Ps2 p = new Adapter(new Usber());
		p.isPs2();
	}
}
