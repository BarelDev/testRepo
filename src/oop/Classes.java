package oop;


class Person { 
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println("name is: " + name);
	}
	
	void email() { 
		System.out.println("email is : " +email);
	}
	
}
public class Classes {
public static void main(String[] args) {
	
	Person p1=new Person();
	p1.name ="Joe";
	p1.email="joe@gmail.com";
	p1.walk();
	p1.email();
}
	
}
