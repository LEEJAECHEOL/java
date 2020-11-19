package test;

import ch05.BlueCloth;
import ch05.Factory;

// protected 는 같은 패키지 + 자식만 상속
public class FactoryApp {

	public static void main(String[] args) {
		Factory f1 = new BlueCloth();
		f1.run();
	}

}
