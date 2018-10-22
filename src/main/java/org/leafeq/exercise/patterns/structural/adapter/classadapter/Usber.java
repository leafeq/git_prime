package org.leafeq.exercise.patterns.structural.adapter.classadapter;

public class Usber implements Usb{

	@Override
	public void isUsb() {
		System.out.println("USB口");
	}

}
