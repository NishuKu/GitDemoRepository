package arrayex;

import java.util.Scanner;

public class MainintegerArray1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of array");
	int n=sc.nextInt();
	
	System.out.println("Enter "+ n + " Array elements.");
	/* INteger Array */
	int x[]=new int[n];
	for(int i=0; i<x.length;i++) {
		x[i]=sc.nextInt();
	}
	
	/* String Array */
	System.out.println("enter" + n +" names.");
	String name[]=new String[n];
	for(int i=0; i<name.length; i++) {
		name[i]=sc.next();
	}
	System.out.println("execution completed");
	}
}
