package arrayex;


public class Except {

	public static void main(String[] args) {
		System.out.println("main starts");
		int arr[]= {100,1000,150,300,350};
		try
		{ 
			
			//System.out.println(arr[5]);
			System.out.println(arr[0]);
			int num=100;
			int b=num/0;
			System.out.println(b);
			
			/*System.out.println(arr[0]);
			int num=100;
			int b=num/5;
			System.out.println(b);
				System.out.println(arr[5]);
				
				System.out.println("printed");*/
				
				
			}
			catch(ArithmeticException ob)
			{
				System.out.println(ob);
				ob.printStackTrace();
				System.out.println("handled");
		
			}
		finally
		{
			System.out.println("printed");
		}
	}
	
}
			