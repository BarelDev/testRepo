package basics;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

import org.omg.Messaging.SyncScopeHelper;

public class SalaryCalc {
	public static void main(String[] args) {
		
		String career;
		System.out.println("...");
		career="Software Developer";
		System.out.println("my career: " + career);
		
		int hourPerWeek=40;
		int weekPerYear=50;
		double rate= 150;
		double salary = hourPerWeek * rate * weekPerYear;
		System.out.println("My Yearly Salary: "  + salary + " as a " + career );
	}

}
