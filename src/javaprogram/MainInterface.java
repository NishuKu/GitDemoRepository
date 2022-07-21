package javaprogram;

interface I1
{
	int x=2;
void start();
static void display()
{
System.out.print("parent 1 class   ");
}
}

interface I2
{
	int y=3;
void show();
static void display()
{
System.out.println("parent 2 class ");	
}
}

class Car implements I1,I2
{
	int z;
public void start()
{
System.out.println("n");
}
public void show()
{
System.out.println("i");
}
}
class MainInterface
{
public static void main(String[]arg)
{
Car c=new Car();
c.z=10;
c.start();
c.show();
System.out.println("z value is "+c.z);

System.out.println("x vlaue is "+c.x);

System.out.println("y value is "+c.y);
I1.display();

I2.display();
}
}

