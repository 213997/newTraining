package com.simpleexample.Projrct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationctx.xml");
		Sim s=(Sim) ctx.getBean("airtel");
		s.calling();
		Sim s2=(Sim) ctx.getBean("jio");
		
		s2.data();
		s2.calling();
	}

}
