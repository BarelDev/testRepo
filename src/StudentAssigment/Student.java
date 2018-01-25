package StudentAssigment;

public class Student {

	private String name;
	private String SSN;
	private String email;
	private String phone;
	private String state;

	
	Student(String name,String SSN) { 
		
		this.name=name;
		this.SSN=SSN;
		setEmailId(name);
		
	}
	
	
	public void setEmailId(String name) {
		
		this.email= name + "@technion.ac.il"; 
	}
}
