package star1;
// 메모리 공간을 읽기 전용으로 변경(final)
class River {
	// 1. 상태
	String name;
	int hp;
	int attack;
	
	// 2. 초기화를 위한 생성자 (마법 X)
	public River(String n, int h, int a) {
		name = n;
		hp = h;
		attack = a;
	}
	
	// 3. 디폴트 생성자를 직접 만들어 준다. 
	// 이유 : 컴파일러가 안만들어 준다.
	public River() {}
	
	// 4. 변수의 값을 변경하거나 확인하는 행위가 필요!!
	
}
