package com.thisKeyword;

public class Test4 {
	public static void main(String[] args) {
		Hello4 h4=new Hello4(101,"aashish");
		h4.show();
	}

}
class Hello4{
	int sid;
	String name;
	Hello4(int sid,String name){
		System.out.println("-----Hello 2arg constroctor-----");
		
		//without this keyword give result default value
		this.sid=sid;
		this.name=name;
	}
	void show() {
		System.out.println(sid+" "+name);
	}
	
}
