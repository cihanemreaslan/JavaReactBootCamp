package Day3Hw2;

public class UserManager {
	public void changePassword(User user, String userPassword) {
		user.setUserPassword(userPassword);
		System.out.println(user.getUserName() + " kullanıcısının şifresi değişti.");
	}

}
