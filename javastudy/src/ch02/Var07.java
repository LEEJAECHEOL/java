package ch02;

// class 자료형
class Car {
	static int power = 2000;
	static String color = "white";
	static String name = "소나타";
	static String type = "승용차"; 
}

public class Var07 {

	public static void main(String[] args) {
		
		System.out.println(Car.power);
		System.out.println(Car.color);
		System.out.println(Car.name);
		System.out.println(Car.type);
	}

}
