package Day3Hw2;

public class Main {

	public static void main(String[] args) {
		Course java = new Course(1,"JAVA");
		
		
		Instructor instructorOne = new Instructor(90,"JAVA");
		instructorOne.setId(1);
		instructorOne.setFirstName("First");
		instructorOne.setLastName("Instructor");
		instructorOne.setUserPassword("PasswordOne");
		
		
		Instructor instructorTwo = new Instructor(50, "SQL");
		instructorTwo.setId(2);
		instructorTwo.setFirstName("Second");
		instructorTwo.setLastName("Instructor");
		instructorTwo.setUserPassword("PasswordTwo");
		
		Instructor instructorThree = new Instructor(70, "SQL");
		instructorThree.setId(3);
		instructorThree.setFirstName("Third");
		instructorThree.setLastName("Instructor");
		instructorThree.setUserPassword("PasswordThree");
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.openCourse(instructorOne, java);
		
		
		Student studentOne = new Student();
		studentOne.setId(1);
		studentOne.setFirstName("Student");
		studentOne.setLastName("One");
		studentOne.setUserPassword("PasswordOne");
		
		Student studentTwo = new Student();
		studentTwo.setId(2);
		studentTwo.setFirstName("Student");
		studentTwo.setLastName("Two");
		studentTwo.setUserPassword("PasswordTwo");
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.enrollCourse(studentOne, java);
	}

}
