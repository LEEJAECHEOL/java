package ch02;

// heap
class Zealot {
	String name = "Zealot";
	int attack = 10;
	int armor = 5;
	static int hp = 100;
}

public class Var08 {
	public static void main(String args[]) {
		Zealot z = new Zealot();
		System.out.println(z.name);
		System.out.println(z.attack);
		System.out.println(z.armor);
		
		Zealot z2 = new Zealot();
		System.out.println(z2.name);
		System.out.println(z2.attack);
		System.out.println(z2.armor);
		
		z.attack = 50;
		System.out.println("변화관찰");
		System.out.println(z.attack);
		System.out.println(z2.attack);
		// hp의 경우 각각의 질럿은 hp가 다르므로 static 으로 하면 안된다.
		Zealot.hp = 50;
		System.out.println(z.hp);
		System.out.println(z2.hp);
		
		// attak의 경우 attack 은 모든 질럿에 적용 되므로static을 사용하여야 한다.
		// 포지
		z.attack = 11;
		System.out.println(z.attack);
		System.out.println(z2.attack);
	}

}
