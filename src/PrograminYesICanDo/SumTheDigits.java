package PrograminYesICanDo;

import java.util.Scanner;

public class SumTheDigits {

	public static void main(String[] args) {

//				Scanner sc= new Scanner(System.in);
//				System.out.println("enter any number");
//				int n=sc.nextInt();
//				int rs=sumDigit(n);
//				
//				System.out.println(rs);
//		
//			}
//		
//		private static int sumDigit() {
			int n=123456;
			int sum = 0;
			int count=0;
			do {
				int r=n%10;
				sum=sum+r;
				n=n/10;	
				count++;
			}
			while(n!=0);
//return sum;
			System.out.println("Sum" + sum);
		}

	}


