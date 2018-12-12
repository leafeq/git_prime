package org.leafeq.exercise.spring.core.ioc.factory;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 *  defaultListable类相关方法学习
 * @author tazui
 *
 */
public class DefaultListable {
	
	/**
	 * 初始化
	 */
	public void initail(String path) {
		ClassPathResource res = new ClassPathResource(path);
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions(res);
	}
	
	public static void main(String[] args) {
		String path = "org/leafeq/exercise/spring/core/xml/beans.xml";

		DefaultListable beanFactory = new DefaultListable();
		
		beanFactory.initail(path);
	}
	
}
