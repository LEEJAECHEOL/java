package coffee;

public class CoffeeApp {

	public static void main(String[] args) {
		Barista b1 = new Barista();
		Customer c1 = new Customer();
		
		// 주문시작
		// 고객은 바리스타와 협력
		c1.order(b1);
		
	}

}
