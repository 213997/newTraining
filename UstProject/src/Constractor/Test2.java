package Constractor;

public class Test2 {
	public static void main(String[] args) {
		Student s=new Student();
		s.id=101;
		s.name="aashish";
		
		s.show();
		Student s1=new Student(102,"Ranjan");
		s1.show();
	}

}
class Student{
	
	int id;
	String name;
	public void show() {
		System.out.println("Student Detail ="+id +" "+name);
	}
	Student(){
		
	}
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}
}
