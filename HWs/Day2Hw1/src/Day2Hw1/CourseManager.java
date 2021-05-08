package Day2Hw1;

public class CourseManager {
	
	public void add(Course course) {
		System.out.println("Kurs eklendi : " + course.name);
	}
	
	public void addMultiple(Course[] courses) {
		for (Course course : courses) {
			System.out.println("Kurs silindi : " + course.name);	
		}
	}

}
