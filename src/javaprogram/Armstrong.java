package javaprogram;

public class Armstrong {

	public static void main(String[] args) {
		int n, s =0,a,b,c ,sum=0;
		System.out.println("Armstrong no within 1000");
		for (int i=1; i<=1000; i++)
		{
			n=i;
			while(n>0)
			{
				a=n%10;
				sum=sum+(a*a*a);
				n=n/10;
			}
			if(sum==i)
			{
				System.out.println(i+"");
			}
			sum=0;
		}
   
	}

}
