package org.leafeq.exercise.patterns.creational.prototype;

import java.util.Random;

public class Client {
	//发送账单等数量
	private static int MAX_COUNT = 6;
	
	public static void main(String[] args) {
		//模拟发送邮件
		int i=0;
		//把模版定义出来，这个是从数据中获取
		Mail mail = new Mail(new AdvTemplate());
		mail.setTail("XX银行版权所有");
		while(i<MAX_COUNT) {
			Mail cloneMail = mail.clone();
			cloneMail.setAppellation(getRandString(5) + " 先生（女生）");
			cloneMail.setReceiver(getRandString(5) + "@" +getRandString(8) + ".com");
			sendMail(cloneMail);
			i++;
		}
	}
	
	//发送邮件
	public static void sendMail(Mail mail) {
		System.out.println("标题："+mail.getSubject() + "\t收件人："
				+ mail.getReceiver() + "\t... 发送成功! ");
	}
	
	public static String getRandString(int maxLength) {
		String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		StringBuffer sb = new StringBuffer();
		Random rand = new Random();
		for(int i=0; i<maxLength; i++) {
			sb.append(source.charAt(rand.nextInt(source.length())));
		}
		return sb.toString();
	}
	
}
