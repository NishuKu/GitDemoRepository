package arrayex;

public class MainArray4 {

	static int[] countEo(int []ar) {
		int ec=0,oc=0;
		for(int i=0;i<ar.length;i++) {
			if(ar[i]%2==0)
				ec++;
			else
				oc++;
		}
		int count[]= {ec,oc};
		return count;
	}
	public static void main(String[] args) {

		int x[]= {45,23,38,67,54,58,49};
		int c[]=countEo(x);
		System.out.println("no of even present in the array: "+c[0]);
		System.out.println("no of odd present in in the array: "+c[1]);
	}

}
