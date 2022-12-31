package Constractor;

public class Test1 {
	public static void main(String[] args) {
		
		Studen s=new Studen();
		
		s.show();
		
	}

}
class Studen{
	int id;
	String name;
	
	public void show() {
		
		System.out.println("Student Detail "+id +" "+name);
	}
}
