package com.my.spring;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.my.spring.Employee;

	public class Main {

		public static void main(String[] args) {
			
			ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
			
			A bean = ioc.getBean("aref",A.class);
			
			System.out.println(bean);
			
		}
}
