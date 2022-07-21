package Part3;

public class chk {

	public static void main(String[] args) {
		int ar[] =new int[10];
		for(int i=0; i<=9; i++) {
			ar[i]=9-i;
		}
		for(int i=0; i<=9; i++) {
			ar[i]=ar[9-i];
		}
		for(int i=0;i<=9;i++) {
			System.out.println(ar[i]);
		}
	}
}
