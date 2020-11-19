package composit;

import lombok.Data;

@Data	//getter setter

public class Coke {
	private int price;
	private String desc;
	public Coke() {
		this(1000, "버거");
	}
	public Coke(int price, String desc) {
		this.price = price;
		this.desc = desc;
		System.out.println(desc + "가 만들어졌습니다.");
	}
	
}
