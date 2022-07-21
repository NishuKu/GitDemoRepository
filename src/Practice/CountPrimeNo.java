package Practice;

import java.util.Scanner;

public class CountPrimeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no");
		int n= sc.nextInt();
		
		int count=0;
		for(int i=0;i<=n;i++)
		{
			if(isPrimenumber(i)==true)
			{
				count++;
				System.out.println(i);
				
			}
		}
		System.out.println("Total prime num is: " + count);
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


