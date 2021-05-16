package Day3Hw2;

public class InstructorManager extends UserManager {
	public void openCourse(Instructor instructor, Course course) {
		if (instructor.getExperienceLevel() >= 70 && course.getName() == instructor.getProgrammingLanguage()) {
			System.out.println(instructor.getFirstName() + " " + course.getName() + " dersini veriyor.");
		} else if (instructor.getExperienceLevel() < 70){
			System.out.println("Ders açabilmek için tecrübeniz yetersiz!");
		} else if (course.getName() != instructor.getProgrammingLanguage()) {
			System.out.println(instructor.getFirstName() + " bu dersi veremez!");
		}
	}
}
