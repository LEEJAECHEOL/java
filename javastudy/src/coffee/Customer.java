package coffee;

// 고객
// 책임 = 메뉴 주문, 먹기
public class Customer {

	public void order(Barista b) {
		// 바리스타에게 메시지를 보냄 -> 함수 호출
		Coffee c = b.makeCoffee();
		System.out.println(c.getName() + "이 나왔습니다.");	
//		eat(c);
	}
//	public void eat(Coffee c) {
//		System.out.println(c.getName() + "을 먹습니다.");
//	}
}
