package arrayex;

import java.util.Scanner;
public class MainArrey3 {
static int sumOfArray(int []ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
	public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
		System.out.println("enetr the size of an aarey");
		int n=sc.nextInt();
		int x[]=new int[n];
		System.out.println("enetr "+n+"elements");
		for(int i=0;i<x.length;i++) {
		x[i]=sc.nextInt();
		int sm=sumOfArray(x);
		}
	}

}
