package ch04;


// 자바 특징 
// 모든 코드는 클래스 내부에 둬야 한다.
public class method01 {
	
	static void add() {
		System.out.println("add함수 호출 됨");
	}
	
	void sound() {
		System.out.println("sound함수 호출 됨");
	}

	public static void main(String[] args) {
		method01.add();
		
		method01 m = new method01();
		m.sound();
	}

}
