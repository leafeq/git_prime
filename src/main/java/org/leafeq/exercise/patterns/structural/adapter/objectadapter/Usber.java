package org.leafeq.exercise.patterns.structural.adapter.objectadapter;

public class Usber implements Usb{

	@Override
	public void isUsb() {
		System.out.println("USB口");
	}

}
