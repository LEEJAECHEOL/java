package ch04;


class TVs {
	int size;
	String mf;
	// 
	public TVs() {
		this(32, "LG");
	}
	public TVs(String mf) {
		this(32, mf);
	}
	public TVs(int size, String mf) {
		this.size = size;
		this.mf = mf;
		System.out.println(size + "인치"+ mf);
	}
	
}
public class TVApp {
	
	public static void main(String[] args) {
		new TVs();
		new TVs("삼성");
		new TVs(65, "samsung");
		
	}

}
