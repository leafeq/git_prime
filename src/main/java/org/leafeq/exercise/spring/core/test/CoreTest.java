package org.leafeq.exercise.spring.core.test;

import org.leafeq.exercise.spring.core.domain.SimpleBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoreTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("org/leafeq/exercise/spring/core/config.xml");
		SimpleBean bean = applicationContext.getBean(SimpleBean.class);
		bean.send();
		applicationContext.close();
	}
}
