package javaprogram;
	

public class MainOverloading {
	

	public static void main(String[] args) {
		Person p1=new Person("qspider", "abc",34256,24);
		Person p2=new Person("qspider", "abc",34256);
		Person p3=new Person("qspider", "abc");
		Person p4 =new Person("qspider");
		p1.display();
		p2.display();
		p3.display();
		p4.display();
	}
}
class Person{
	String branch;
	String name;
	long id;
	int age;
	Person(String branch, String name,long id, int age){
		this.branch=branch;
		this.name=name;
		this.id=id;
	    this.age=age;
	}
	

public void display() {
	System.out.println(branch);
	System.out.println(name);
	System.out.println(id);
	System.out.println(age);
}

Person(String branch, String name,long id){
	this.branch=branch;
	this.name=name;
	this.id=id;
}
Person(String branch, String name){
	this.branch=branch;
	this.name=name;
}
Person(String branch){
	this.branch=branch;

}
}



	

	

	

