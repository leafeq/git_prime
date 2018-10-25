package org.leafeq.exercise.patterns.structural.proxy;

public class Client {
	public static void main(String[] args) {
		//定义一个痴迷的玩家
		IGamePlayer player = new GamePlayer("张三");
		//开始游戏
		System.out.println("开始时间：2019-8-12 10:12");
		player.login("zhangsan","123456");
		player.killBoss();
		player.upgrade();
		System.out.println("结束时间：2019-8-12 20:12");
	}
}
