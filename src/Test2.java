class Fruit{
	static String v;
	String name;
	Fruit(String fruit){
		name = fruit;
	}
	String getFruit(){
		return name;
	}
	
	public String toString() {
		return name;
	}
	
	public boolean equals(Object o) {
		if(this.toString() == o.toString()) {
			return true;
		}
		else {
			return false;
		}
	}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		System.out.println(s1);
		
		Fruit f1 = new Fruit("Orange");
		Fruit f2 = new Fruit("Apple");
		
		System.out.println(f1.equals(f2));
		
		System.out.println(f1.v);
		
	}

}
