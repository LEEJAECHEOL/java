package ch05;

// 1. 인터페이스는 new할수 없다.
// 2. 인터페이스는 변수를 가질수 있다. 그 변수는 public static final 이다
// 3. 인터페이스는 추상메서드를 가진다. 그 메서드는 public abstract이다.
// 4. 인터페이스는 정상적인 메서드를 가질 수 없다.
// 5. 인터페이스는 구현하는 클래스는 반드시 오버라이딩 해야함
interface Remocon {
	public static final String name = "리모컨";
	public abstract void control();
}




public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}