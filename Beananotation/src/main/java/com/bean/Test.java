package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//System.out.println("------Now Spring Container is Ready-----");
		
		Hello h=(Hello) ctx.getBean("hello");
		
	}

}
