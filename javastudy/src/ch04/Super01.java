package ch04;

class Car {
	String desc = "Sonata Parent";
	public Car() {
		System.out.println("Car");
	}
}
class Sonata extends Car {
	public Sonata() {
		super();
		System.out.println(super.desc);
		System.out.println("Sonata");
	}
}

public class Super01 {

	public static void main(String[] args) {
		new Sonata();
		
	}

}
