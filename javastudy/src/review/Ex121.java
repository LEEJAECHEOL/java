package review;

// 자바는 함수만 만들수가 없다. 
// 더하기 함수를 만들고 싶음 -> 더하기 함수를 만들려면 클래스가 필요함
// 상태 없는 메서드 하나를 만들고 싶으면 인터페이스로 만듬

interface A {
	void add() ;
}


public class Ex121 {

	public static void main(String[] args) {
		
		// 인터페이스로 익명클래스
		new A() {
			@Override
			public void add() {
				System.out.println("add!!");
			}
		}.add();
	}

}
