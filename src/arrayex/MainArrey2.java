package arrayex;

public class MainArrey2 {

	static int getBiggest(int []ar) {
		int big=ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>big)
				big=ar[i];
		}
		return big;
	}
	public static void main(String[] args) {

		int x[]= {45,23,38,67,54,58,49};
		int bg=getBiggest(x);
		System.out.println("Biggest is: "+bg);
	}

}
