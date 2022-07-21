package PrograminYesICanDo;

import java.util.Scanner;

public class CountLettersFromString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string with no");
		String st=sc.nextLine();
		countDigit(st);
	}
	public static void countDigit(String st) {
		char[] ch=st.toCharArray();
		System.out.println(st);
		int letters=0; int digits=0; int space=0; int others=0;
		for(int i=0;i<st.length();i++) {
			
			if(Character.isAlphabetic(ch[i])){
				letters++;
			}
			else if(Character.isDigit(ch[i])) {
				digits++;
				
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				others++;
			}
		}
		System.out.println("Letters are :  "+letters);
		System.out.println("Digitts are :  "+digits);
		System.out.println("Spaces are :  "+space);
		System.out.println("others are :  "+others);


	}
}


