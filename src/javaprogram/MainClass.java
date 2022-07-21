package javaprogram;

class Animal{
int tail;
int legs;

Animal(int tail,int legs)
{
this.tail=tail;
this.legs=legs;
}
}
 class Dog extends Animal{
String name;
String color;

Dog(int tail,int legs, String name,String color)
{
super (tail,legs);
this.name=name;
this.color=color;
}

void displayDog()
{
System.out.println(tail);
System.out.println(legs);
System.out.println(name);
System.out.println(color);
}
}
class MainClass{
public static void main(String []arg)
{
Dog d =new Dog(1,4,"pubg","white and brown");
d.displayDog();
}
}


