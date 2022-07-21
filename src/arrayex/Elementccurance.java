package arrayex;
/* WAP to count the frequency of an element in an array. */

public class Elementccurance {
public static void main(String[] args) {
int ar[]= {34, 45,56,23,45,45,23,89,65,43,65,23};
boolean rs[]=new boolean[ar.length];
	for(int i=0;i<ar.length;i++) {
		if(rs[i]==false) 
	{		
		int count=1;
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]==ar[j])
			{
				count++;
				rs[j]=true;
			}
		}
		System.out.println(ar[i]+ " Present in "+ count +"times");
			}
		}
	}
}

