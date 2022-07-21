package PrograminYesICanDo;

import java.util.Scanner;

public class PalindromNo {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int n=sc.nextInt();
		boolean b=isPalindromNo(n);
		if(b==true) {
		System.out.println(n+"  is palindrom");
		}
		else {
		System.out.println(n+"  is not palindrom");	
		}

	}
	public static boolean isPalindromNo(int n) {
		int r;
		int sum=0; int temp=n;
		do {
			
			
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			

		}while(n!=0);
		return temp==sum;
	}

}
