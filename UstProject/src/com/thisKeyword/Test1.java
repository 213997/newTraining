package com.thisKeyword;

public class Test1 {
	public static void main(String[] args) {
		
		Hello1 h1=new Hello1();
		h1.show();
		
	}

}
class Hello1{
	int a=10;
	 void show() {
		 String a="show";
		 System.out.println(a);
		 System.out.println(this.a);
	 }
	 
}