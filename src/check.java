

public class check {

	public static void main(String[] args) throws ArithmeticException {

	try {
		System.out.println(10/0);
	}
	catch(ArithmeticException e) {
		System.out.println("handled");
	}
	System.out.println("shoukd ex");
	}

}
