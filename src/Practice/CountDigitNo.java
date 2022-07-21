package Practice;

import java.util.Scanner;

public class CountDigitNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int n = sc.nextInt();
		int count = countDigit(n);
		System.out.println(count);
	}

	private static int countDigit(int n) {
		int count = 0;
		do {
		 n=n/10;	
		 count++;
		}
		while(n!=0);
		return count;
	}

}
