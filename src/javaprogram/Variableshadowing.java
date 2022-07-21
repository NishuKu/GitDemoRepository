package javaprogram;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Variableshadowing {
	int x; //global variablee no need to initilize.
	static int y;
	public static void main(String[] args) 
	{
		int x=10;
		int y=20;
 //local variable needs to be initilized at the time of variable declaration
	//	System.out.println("local "+x);
		Variableshadowing vs=new Variableshadowing();
		vs.x=67;
		System.out.println("global "+vs.x);
		System.out.println("local "+x);
		System.out.println("local y"+y);
//no need of object refrence to call a static variable in main
		System.out.println("global static y "+Variableshadowing.y);
	}
}
