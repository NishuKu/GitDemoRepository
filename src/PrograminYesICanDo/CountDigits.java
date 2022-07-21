package PrograminYesICanDo;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter any number");
		int n=sc.nextInt();
		int rs=countDigit(n);
		for(int i=0;i<=n;i++)
		System.out.println(rs);


	}
	private static int countDigit(int n) {
		int count = 0;
		for(count=0; n!=0; n=n/10) {
			
		count++;
		}return count;
//		do {
//		 n=n/10;	
//		 count++;
//		}
//		while(n!=0);
//		return count;
	}

}


