package com.p1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		Car bean = context.getBean(Car.class);
		System.out.println(bean.hashCode());
		bean.drive();
		
		Car bean1 = context.getBean(Car.class);
		System.out.println(bean1.hashCode());
		bean1.drive();
	}

}
