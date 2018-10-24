package org.leafeq.exercise.patterns.structural.flyweight.common;

/**
 * 抽象享元角色
 * @author tazui
 *
 */
public abstract class Flyweight {
	
	//内部状态
	private String	instrinsic;
	//外部状态
	protected final String Extrinsic;
	//要求享元角色必须接受外部状态
	public Flyweight(String _Extrinsic) {
		this.Extrinsic = _Extrinsic;
	}
	
	//定义业务操作
	public abstract void operate();

	public String getInstrinsic() {
		return instrinsic;
	}

	public void setInstrinsic(String instrinsic) {
		this.instrinsic = instrinsic;
	}
	
	
	
	
}
