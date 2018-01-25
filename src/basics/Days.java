package basics;

public class Days {
	public static void main(String[] args) {
		
		String dayOfWeek="Tuesday";
		System.out.println("What day is Today");
		whatDay(dayOfWeek);
		System.out.println("adding code to my project");
		
	}
	
	static void whatDay(String day) {
		switch(day) {
			case "Monday":
				System.out.println("Today is Monday");
				break;
			case "Tuesday":
				System.out.println("Today is Tuesday");
				break;
			case "Wednesday":
				System.out.println("Today is Wednesday");
				break;
		
		}
	}
	

}
