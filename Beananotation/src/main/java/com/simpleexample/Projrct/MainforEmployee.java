package com.simpleexample.Projrct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainforEmployee {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationctx2.xml");
		Employee e=(Employee) ctx.getBean("emp");
		e.display();
	}

}
