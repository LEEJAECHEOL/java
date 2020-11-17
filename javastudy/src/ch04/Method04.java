package ch04;

// 메서드안에 메서드를 정의 할 수 없다. cmd shift f : 정렬
// 변수에 메드를 담을 수 없다.
public class Method04 {

	int money = 10000; // heap
	
	void add(int num) { // int num -> stack, add() -> heap
		this.money += num;
	}
	int add2(int num) {
		int money2 = money + num;
		return money2;
	}
	public static void main(String[] args) {
		Method04 m = new Method04();
		m.add(50000);
		int money2 = m.add2(50000);
		System.out.println(m.money);
		System.out.println(money2);
	} 

}
