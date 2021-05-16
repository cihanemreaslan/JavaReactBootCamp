package Day3Hw2;

public class Instructor extends User {

	private int experienceLevel;
	private String programmingLanguage;

	public Instructor(int experienceLevel, String programmingLanguage) {
		this.experienceLevel = experienceLevel;
		this.programmingLanguage = programmingLanguage;
	}

	public int getExperienceLevel() {
		return experienceLevel;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

}
