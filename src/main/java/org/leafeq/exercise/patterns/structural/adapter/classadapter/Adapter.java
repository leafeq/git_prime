package org.leafeq.exercise.patterns.structural.adapter.classadapter;

/**
 * 类适配器模式
 * @author tazui
 *
 */
public class Adapter extends Usber implements Ps2 {

	@Override
	public void isPs2() {
		isUsb();
	}

}
