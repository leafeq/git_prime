package org.leafeq.exercise.patterns.structural.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.leafeq.exercise.patterns.structural.proxy.GamePlayer;
import org.leafeq.exercise.patterns.structural.proxy.IGamePlayer;

public class Client {
	public static void main(String[] args) {
		IGamePlayer player = new GamePlayer("zhangsan");
		//定义一个handler
		InvocationHandler handler = new GamePlayIH(player);
		//获得类的class loader
		ClassLoader cl = player.getClass().getClassLoader();
		//动态生产一个代理
		IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(cl, player.getClass().getInterfaces(),handler);
		proxy.login("zhangsan", "123456");
		proxy.killBoss();
		proxy.upgrade();
	}
}
