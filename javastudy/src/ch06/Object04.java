package ch06;
class User{
	private int id;
	private String username;
	private String password;
	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}


	public User(int id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
}

public class Object04 {
	public static void main(String[] args) {

		User user = new User(1, "ssar", "1234");
		
		// 레퍼런스를 호출하면 자동 toString호출
		System.out.println(user);
		
		String s = "Hello";
		System.out.println(s.toString());
	}
}
