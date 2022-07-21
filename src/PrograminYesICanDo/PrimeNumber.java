package PrograminYesICanDo;

import java.security.PublicKey;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean b= isPrimeNumber(n);
		if(b==true) {
			System.out.println(n+"  is not prime no.");
		}
		else{
			System.out.println(n+"  is prime no.");
		}

	}

	public static boolean isPrimeNumber(int n) {
		for(int i=2;i<n/2;i++) {
			if(n%i==0) {

				return false;
			}
		}
		return false;
	}
}

