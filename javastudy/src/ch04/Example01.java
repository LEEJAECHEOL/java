package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
class Tv {
	private String name;
	private int year;
	private int inch;
	
	void show() {
		System.out.println(getName() + "에서 만든 " + getYear() + "년형" +getInch() + "인치 TV");
	}
}

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv myTv = new Tv("LG", 2017, 32);
		myTv.show();
	}

}
