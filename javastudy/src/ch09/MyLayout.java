package ch09;

// 여러가지를 매핑할 수 있음.
public enum MyLayout {
	WEST("West"),
	EAST("East"),
	SOUTH("South"),
	NORTH("North"),
	CENTER("Center");
	
	private String value;
	
	public String getValue() {
		return value;
	}
	
	private MyLayout(String value) {
		this.value = value;
	}
}
