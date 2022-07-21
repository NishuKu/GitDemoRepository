package arrayex;

import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(700);
		a1.add(800);
		a1.add(150);
		System.out.println(a1);
		
		ArrayList<Integer>a12=new ArrayList<Integer>();
		a12.add(500);
		a12.add(1000);
		a12.add(800);
		a12.addAll(a12);

	}

}
