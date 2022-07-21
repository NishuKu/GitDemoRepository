package Part3;

import java.util.Scanner;
import javaprogram.*;

public class boxing 
{
public static void main(String[] args) {
int a=100;
System.out.println(a);

/*Below statement is implicitly done by the compiler. 
 * can also be done as Integer b=a;
 it's conversion from primitive to non-primitive. known as auto boxing.
   */

Integer c=Integer.valueOf(a); //Boxing
System.out.println(c);

Integer b=a;	//Auto-boxing
System.out.println(b);

Parent2 ob = new Parent2();
}
}
