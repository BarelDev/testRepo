package oop;

public class BankAccount implements IRate {
	
	String accountNumber;
	private static final String routingNumber="05721";
	private String name;
	String ssn;
	String accountType;
	double balance=0;
	
	BankAccount () {
		System.out.println("new account created");
		
	}
	
	BankAccount (String accountType) {
		
		this.accountType=accountType;
		System.out.println("new account from type " + accountType + " was created");
	}
	
	BankAccount(String accountType,double initDeposit) {
		
		this.accountType=accountType;
		System.out.println("new account type " + accountType + " was created");
		System.out.println("inital deposit is : " +initDeposit);
		if (initDeposit < 1000) {
			System.out.println("you need to deposit a bigger amount than " +initDeposit);
		}
		else {
			System.out.println("Thanks for your deposit");
		}
		balance=balance+initDeposit;
		
	}
	
	public void deposit(double amount) {
		balance=balance+amount;
		showActivity("DEPOSIT");
		
	}
	
	public void withDraw(double amount) {
		balance=balance-amount;
		showActivity("WITHDRAW");
		
	}
	
	private void showActivity(String activity) {
		System.out.println("Your recent transaction: " + activity );
		System.out.println("Your new balance is: " +balance );
	}

	void checkBalance() {
		System.out.println("your balance is : " + balance);
		
	}
	
	void getStatus() {
		
	}
	@Override
	public String toString() {
		return "Name: " + name + "Account Number: " + accountNumber  + 
	"AccountType: " + accountType  + "Balance: " + balance;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setRate() {
		
		System.out.println("SETTING RATE");
	}
	
	public void increaseRate() {
		System.out.println("ICREASING RATE");
		
	}
}
