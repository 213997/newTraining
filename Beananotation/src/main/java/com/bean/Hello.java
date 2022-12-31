package com.bean;

public class Hello {
	static {
		System.out.println("Hello-static block");
	}
	public Hello() {
		System.out.println("Hello D C");
	}
	
	public void showHello() {
		System.out.println("Hello -showHello");
	}

}
