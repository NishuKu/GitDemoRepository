package arrayex;

public class Example {

	public static void main(String[] args) {
String s= "QSPIDERSSS";
String lower =s.toLowerCase();
String upper =s.toUpperCase();
char charAt=s.charAt(3);
String sub=s.substring(2);
String sub1=s.substring(1,4);
String tr=s.trim();
int in=s.indexOf('S',2);
int in1=s.lastIndexOf('S');
int in2=s.length();
System.out.println(s);
System.out.println(lower);
System.out.println(upper);
System.out.println(charAt);
System.out.println(sub);
System.out.println(sub1);
System.out.println(tr);
System.out.println(in);
System.out.println(in1);
System.out.println(in2);
	}

}
