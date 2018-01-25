package oop;

public class BankAccountApp {
	
	public static void main(String[] args) {
		
		//BankAccount acc1= new BankAccount();
		//BankAccount acc2=new BankAccount("Buisness");
		BankAccount acc3=new BankAccount("private",2000);
		acc3.setName("john");
	acc3.checkBalance();
	System.out.println(acc3.toString());
	String nn="check";
	//CDaccount cd1=new CDaccount();
	//cd1.accountType="cd";
	//cd1.setName("dan");
	//cd1.balance=3000;
	//cd1.interstRate="4.5";
	//cd1.compound();
	
	acc3.deposit(500);
	acc3.withDraw(100);
	acc3.setName("check");
	if(acc3.getName() == nn )
		System.out.println("OK");
	}

}
