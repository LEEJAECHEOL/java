package login;


public class FaceBook implements OAuth {
	private String provider;
	private String email;
	private String password;
	private String username;
	
	public FaceBook() {
		this("facebook", "ssar@nate.com", "1234", "깨봉");
	}

	public FaceBook(String provider, String email, String password, String username) {
		super();
		this.provider = provider;
		this.email = email;
		this.password = password;
		this.username = username;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String oAuthProvider() {
		// TODO Auto-generated method stub
		return this.provider;
	}

	@Override
	public String oAuthId() {
		// TODO Auto-generated method stub
		return this.email;
	}

	@Override
	public String oAuthPassword() {
		// TODO Auto-generated method stub
		return this.password;
	}

	@Override
	public String oAuthNick() {
		// TODO Auto-generated method stub
		return this.username;
	}

	
	
}
