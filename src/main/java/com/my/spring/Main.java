package com.my.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	public class Main {

		public static void main(String[] args) {
			
			AbstractApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
			
			Pepsi bean = ioc.getBean("Pepsi",Pepsi.class);
			
			System.out.println(bean);
			ioc.registerShutdownHook();
		}
}
