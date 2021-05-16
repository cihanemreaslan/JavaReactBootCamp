package Day3Hw2;

public class User {
	private int id;
	private String userNumber;
	private String userName;
	private String userPassword;
	private String firstName;
	private String lastName;

	public User() {
	}

	public User(int id, String userPassword, String firstName, String lastName) {
		this.id = id;
		this.userNumber = id + "-" + userName;
		this.userName = id + firstName;
		this.userPassword = userPassword;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
