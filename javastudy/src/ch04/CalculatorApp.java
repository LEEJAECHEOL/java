package ch04;



public class CalculatorApp {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		int add = c.add(10, 5);
		int multi = c.multi(add, 20);
		int divid = c.divid(multi, 5);
		int  minus = c.minus(divid, 100);
		System.out.println(minus);
	}

}
