package Practice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int n=sc.nextInt();

		boolean rs=isPrimenumber(n);
		if(rs==true)
			System.out.println("Prime");
		else
			System.out.println("not prime");

	}

	private	static boolean isPrimenumber(int n){
		if(n==0 || n==1)
			return false;
		for(int i=2; i<=n/2; i++) {
			if(n%i==0)
				return false;		
		}return true;	
	}
}


