package arrayex;
public class Login {
public static void main(String[] args){
	try {
		check(1234);
		}
	catch(WrongPwdException w) {
			System.out.println(w);
		}
	}

public static void check(int pwd) throws WrongPwdException {
		int pin=2345;
		if (pin==pwd)
		{
			System.out.println("go ahead");
		}
		else {
			throw new WrongPwdException("incorrect password");
		}
	}
}
//h3[.='HRX by Hrithik Roshan'])[1]/../div	
 class WrongPwdException extends Exception{
	public WrongPwdException(String s) 
		{
			super(s);
		}
	}
	

