package javaprogram;

class parent
{
	 int x=50;

	
	
}

class child extends parent
{
	int x=100;
	
	void display()
	{
		System.out.println("Child class value "+ x);
		System.out.println("Parent class value" + super.x);
	}
}
public class VarHiding {

	public static void main(String[] args) {
		child c=new child();
		//c.x=20;
		//System.out.println(c.x);
		c.display();
	}

}
