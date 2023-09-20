package labs;

public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student std1 = new Student("Jason", "123456");
		Student std2 = new Student("Jake", "456789");
		std1.enroll("Language 1");
		std1.enroll("Math 2");
		std1.enroll("Quimics 3");
		std1.enroll("Biology 4");
		std1.enroll("Physics 5");
		std1.enroll("Social Studies 6");
		std1.enroll("Spanish 7");
		std1.enroll("Workshop 8");
		std1.enroll("Music 9");
		std1.enroll("Geography 10");
		std1.enroll("Something else 11");
		std1.enroll("Last 12");
		std1.showCourses();
		std2.showCourses();
		std1.checkBalance();
		std1.pay(600);
		
	}

}
