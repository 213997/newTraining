package com.thisKeyword;

public class Test3 {
	public static void main(String[] args) {
		Hello3 h3=new Hello3();
		h3.show();
		
	}

}
class Hello3{
	int a=10;
	String b="class";
	
	public void show() {
		int a=20;
		String b="method";
		
		System.out.println(a);
		System.out.println("----"+this.a);
		System.out.println(b);
		System.out.println("----"+this.b);
		
	}
	
}
