package star1;

public class Star1App {
	
	// zealot -> dragon
	static void attack(Zealot u1, Dragon u2) {
		System.out.println(u1.name + " -> " + u2.name + " attck");
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name + " hp : " + u2.hp);
	}
	// dragon -> zealot
	static void attack(Dragon u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + " attck");
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name + " hp : " + u2.hp);
	}	
	// dragon -> dragon
	static void attack(Dragon u1, Dragon u2) {
		System.out.println(u1.name + " -> " + u2.name + " attck");
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name + " hp : " + u2.hp);
	}	
	// dragon -> dragon
	static void attack(DarkTempler u1, Zealot u2) {
		System.out.println(u1.name + " -> " + u2.name + " attck");
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name + " hp : " + u2.hp);
	}	
	// dragon -> dragon
	static void attack(DarkTempler u1, Dragon u2) {
		System.out.println(u1.name + " -> " + u2.name + " attck");
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.name + " hp : " + u2.hp);
	}	
	// 오버로딩 : 함수 이름이 같아도 매개변수의 개수,  타입이 다르면 다른 함수로 인식한다. (과적재)
	public static void main(String[] args) {

		Zealot z1 = new Zealot("질럿1", 100, 10);
		Dragon d1 = new Dragon("Dragon1", 100, 20);
		Dragon d2 = new Dragon("Dragon2", 100, 20);
		DarkTempler da1 = new DarkTempler("다크템플러1", 100, 50);
		DarkTempler da2 = new DarkTempler("다크템플러2", 100, 50);
		
		// 1. zealot1 -> dragon1 attack
		attack(z1, d1);
		
		// 2. dragon1 -> zealot1 attack
		attack(d1, z1);
		
		// 3. dragon1 -> dragon2 attack
		attack(d1, d2);
		
		// 4.다크템플럿 1 -> 질럿 1 공격
		attack(da1, z1);
		
		// 5. 다크 템플럿 2 -> 드라군 1 공
		attack(da2, d1);
	}

}
