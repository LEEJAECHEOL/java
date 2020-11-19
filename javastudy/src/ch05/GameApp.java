package ch05;

public class GameApp {
	static void start(Controll c) {
		c.엑셀();
		c.브레이크();
	}

	public static void main(String[] args) {
		Sonata s = new Sonata();
		start(s);
	}

}
