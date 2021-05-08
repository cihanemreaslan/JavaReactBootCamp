package Day2Hw1;

public class Course {
	int id;
	String name;
	String detail;
	int day;
	String instructorName;

	public Course() {
		
	}

	public Course(int id, String name, String detail, int day, String instructorName) {
		this();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.day = day;
		this.instructorName = instructorName;
	}
	
}
