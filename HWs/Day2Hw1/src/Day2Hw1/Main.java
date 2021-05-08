package Day2Hw1;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(1,"Java", "Java&React Bootcamp", 16, "Engin Demiroğ");
		Course course2 = new Course(1,"C#", "C#&Angular Bootcamp", 16, "Engin Demiroğ");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.add(course1);
		
		Course[] courses = {course1, course2};
		courseManager.addMultiple(courses);
		
		Category category = new Category();
		
		category.id = 1;
		category.name = "Programlama";
		
		System.out.println(category.name);

	}

}
