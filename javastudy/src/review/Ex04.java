package review;

import lombok.Data;

// 커스텀 자료형
@Data	// toString getter setter
class Product {
	private int no;	// 상품번호
	private int price; // 가격 
	private String name; // 상품 이름
}

public class Ex04 {

	public static void main(String[] args) {
		// 클래스 자료형 : 여러가지 데이터 타입이 썩여있을 때 사용
		Product p1 = new Product();
		System.out.println(p1);
	}

}
