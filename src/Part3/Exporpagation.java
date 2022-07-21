package Part3;

public class Exporpagation {
	public static void main(String[] args) {
		System.out.println("main starts");
		show();
	}
//	static void calc() {
//	show();
//
//}
	 static void show() {
		System.out.println("show method");
		try {
			System.out.println(100/0);
			System.out.println("division done");
		}
		catch(ArithmeticException ob) {
		ob.printStackTrace();
			//System.out.println(ob);
		}
	}
}
