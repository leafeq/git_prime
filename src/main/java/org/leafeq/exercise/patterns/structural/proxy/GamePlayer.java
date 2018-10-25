package org.leafeq.exercise.patterns.structural.proxy;

public class GamePlayer implements IGamePlayer {

	private String name = "";
	//通过构造函数传递名称
	public GamePlayer(String _name) {
		this.name = _name;
	}
	
	
	//游戏之前肯定需要登录
	public void login(String user, String password) {
		System.out.println("登录名为"+user+"的用户"+this.name+"登录成功!");
	}

	//打怪
	public void killBoss() {
		System.out.println(this.name + "在打怪！");
	}

	//升级
	public void upgrade() {
		System.out.println(this.name + " 又升了一级");
	}

}
