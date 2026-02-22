package com.my.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext ioc =
				new ClassPathXmlApplicationContext("application-context.xml");
		
		Emp bean = ioc.getBean("emp1", Emp.class);
		
		System.out.println(bean);
	}
}
