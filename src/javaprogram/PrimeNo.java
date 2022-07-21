package javaprogram;

class PrimeNo
{
   public static void main (String[] args)
   {		
       int i =0;
       int num =0;
      
       String  primeNo = "";

       for (i = 1; i <= 100; i++)         
       { 		  	  
          int t=0; 	  
          for(num =i; num>=1; num--)
	  {
             if(i%num==0)
	     {
 		t = t + 1;
	     }
	  }
	  if (t ==2)
	  {
	  
	     primeNo = primeNo + i + " ";
	  }	
       }	
       System.out.println("prime no from 1 to 100 are :");
       System.out.println(primeNo);
   }
}
