package labs;

public class Student {
	
	private String name;
	private String SSN;
	private String email; //name@gmail.com
	private static int ID = 1000;
	private String userId; // ID + 4 digit number + last 4 of SSN
	private String phone;
	private String city;
	private String state;
	String[] courses= new String[10];
	private static final int costOfCourse = 800;
	private int balance = 0;
	
	
	public Student(String name, String SSN) {
		this.name = name;
		this.SSN = SSN;
		this.email = name.toLowerCase() + "@gmail.com";
		// this.userId = ID + "" + (int)(Math.random() *10000) +""+ SSN.substring(2,6);
		setUserId();
		for(int i=0; i< 10; i++) {
			this.courses[i]= null;
		}
		System.out.println(toString());
		ID ++;
	}
	
	private void setUserId() {
		int max= 9000;
		int min = 1000;
		this.userId = ID + "" + (int)(Math.random() *(max - min)) +""+ SSN.substring(2,6);
	}

	public String getName() {
		return name;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String getState() {
		return this.state;
	}
	
	
	public void enroll(String course) {
		// this.courses = this.courses + "\n" + course;
		int i=0;
		while( i< this.courses.length) {
			if(courses[i]==null) {
				System.out.println(this.getName() + " is enrolled to " + course);
				this.courses[i]= course;
				System.out.println("El largo de los cursos es: " + this.courses.length);
				System.out.println(i);
				balance += costOfCourse;
				break;	
		}
		i++;
		}
		if(i>= this.courses.length) {
		System.out.println("No se puede anotar a " + course);
		}
	}
		
	public void pay(int amount) {
		this.balance -= amount;	
		this.checkBalance();
	}
	public void checkBalance() {
		System.out.println("Balance is " + balance);
	}
	public String toString() {
		return name + " - " + email + " - " + userId + " - " + SSN + this.getName() + " " + this.getCity() + " " + this.getState();
	}
	public void showCourses() {
		if(this.courses[0]!=null) {
		for(int i=0; i< this.courses.length; i++) {
			System.out.println(this.courses[i]);
		}
		}else {
			System.out.println("No hay cursos para " + this.getName());
	}
}
	
}

