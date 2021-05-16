package Day3Hw2;

public class StudentManager extends UserManager {

	public void enrollCourse(Student student, Course course) {
		if (student.getCourse() == null) {
			student.setCourse(course);
			System.out.println(student.getId() + " id nolu öğrencinin " + course.getName() + " dersine kaydı yapıldı.");
		} else {
			System.out.println("Her öğrenci tek derse kayıt olabilir." + student.getId() + " id nolu öğrenci "
					+ student.getCourse() + " dersine kayıtlı!");
		}
	}

}
