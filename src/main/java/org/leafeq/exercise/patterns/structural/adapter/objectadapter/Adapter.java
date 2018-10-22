package org.leafeq.exercise.patterns.structural.adapter.objectadapter;

/**
 * 对象适配器
 * @author tazui
 *
 */
public class Adapter implements Ps2{

	private Usb usb;
	
	public Adapter(Usb usb) {
		this.usb = usb;
	}
	
	@Override
	public void isPs2() {
		usb.isUsb();
	}

}
