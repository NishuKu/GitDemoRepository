package arrayex;
/*WAP to merge 2 shorted array into a single array in sorted format */
public class MergeShortaray {
	
	static int[] merge(int a[], int b[]) {
		int c[]=new int[a.length+b.length];
		int i=0, j=0, k=0; //i for a, j for b, k for c
		while(i<a.length && j<b.length) {
			if(a[i]<b[j])
				c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length) {
			c[k++]=a[i++];
		}
		while(j<b.length) {
			c[k++]=b[j++];
		}
		return c;
	}
public static void main(String[] args) {

	}

}
