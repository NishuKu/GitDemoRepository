package javaprogram;

 class Parent1
{
	int x=50;
	
	void display( )
	{
		int x=10;
		System.out.println(x);
		System.out.println(this.x);
	}
}

public class VarShadowing {

	public static void main(String[] args) {
		Parent1 ob=new Parent1();
		ob.display();
	}

}
