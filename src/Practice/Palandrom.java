package Practice;

import java.util.Scanner;

public class Palandrom {


	static boolean isPalandrom(int n)
	{
		int rev=0; int temp=n;
		do
		{
			int rem=n%10;
			rev=(rev*10)+rem;
			n=n/10;
		}
		while(n>0);
		return temp==rev;

	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");//121
		int n= sc.nextInt();
		boolean rs = isPalandrom(n);
		if(rs==true)
			System.out.println("Palandrom");
		else
			System.out.println("not palandrom");




	}
}
 