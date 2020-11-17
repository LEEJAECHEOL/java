package star1;

class Zealot2 extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	
	public Zealot2(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	public Zealot2() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
}
class Tank2 extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	
}
class Scv2 extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	
}

class Dragon2 extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	
	public Dragon2(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	public Dragon2() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	
}

class DarkTempler2 extends StarUnit {
	private String name;
	private int hp;
	private int attack;
	
	public DarkTempler2(String name, int hp, int attack) {
		this.name = name;
		this.hp = hp;
		this.attack = attack;
	}
	public DarkTempler2() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}
	
}

class Marin2 extends StarUnit {
	private String name;
	private int hp;
	private int attack;
}

public class Star3App {

	static void attack(StarUnit u1, StarUnit u2) {
		// 1. hp를 수정할 수 있는 함수 setHp(int hp)
		// 2. hp의 값을 확인하는 함수 getHp()
		// 3.attack의 값을 확인하는 getAttack();
		System.out.println(u1.getName() + " -> " + u2.getName() + " attck");
		u2.setHp( u2.getHp() - u1.getAttack());
		System.out.println(u2.getName() + " hp : " + u2.getHp());
	}

	public static void main(String[] args) {

		Zealot2 z1 = new Zealot2("질럿1", 100, 10);
		Dragon2 d1 = new Dragon2("Dragon1", 100, 20);
		Dragon2 d2 = new Dragon2("Dragon2", 100, 20);
		DarkTempler2 da1 = new DarkTempler2("다크템플러1", 100, 50);
		DarkTempler2 da2 = new DarkTempler2("다크템플러2", 100, 50);
		
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
