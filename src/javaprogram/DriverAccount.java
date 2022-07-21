package javaprogram;


 class Account{
	double acctno;
	double ifsc;
	String bankname;
		void print() {
			System.out.println("account no is :"+acctno);
			System.out.println("ifsc code is:"+ifsc);
			System.out.println("bankname is :"+bankname);
	}
}
class SavingAccount extends Account{
    	void print() {
    		double acctno= 74659d;
    		double ifsc = 5432d;
    		String bankname="Sindbank";
    	}
    	void displaySaving() {
    		System.out.println("account no of saving account is :"+acctno);
    		System.out.println("ifsc code is:"+ifsc);
    		System.out.println("bankname is :"+bankname);
    	}
    }
class CurrentAccount extends Account{
    void print() {
    	double acctno= 1234d;
		double ifsc = 9876d;
		String bankname="hdfc";
	 }
	void displayCurrent() {
		System.out.println("account no cuurent account is :"+acctno);
		System.out.println("ifsc code is:"+ifsc);
		System.out.println("bankname is :"+bankname);
	
     }	
    }

public class DriverAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a= new SavingAccount();
		a.acctno=354d;
		a.ifsc=4565d;
		a.bankname="sbi";
		SavingAccount sa=(SavingAccount)a;
		sa.displaySaving();
		System.out.println("/n");
		
		Account aa=new CurrentAccount();
		aa.ifsc=2343;
		aa.bankname="hdfc";
		CurrentAccount ca=(CurrentAccount)aa;
		ca.displayCurrent();
		
	}
}
