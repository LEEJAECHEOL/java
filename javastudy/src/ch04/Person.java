package ch04;

public class Person {
	String name;
	String job;
	int age;
	char gender;
	String blood;
	
	// 초기화를 위한 생성자
	// 디폴트 생성자는 생성자가 하나도 없으면 컴파일러가 자동으로 만들어줌.
	// 만약에 생성자가 있으면 디폴트 생성지를 만들어 주지 않음.
	// 이 경우에는 디폴트를 직접 만들어 주어야함 (오버로등)
	public Person() {
	}
	public Person(String name, String job, int age, char gender, String blood) {
		this.name = name;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.blood = blood;
		System.out.println("사람이 태어남.");
	}
	
	void preview() {
		System.out.println("==== " + name + " ====");
		System.out.println("직업 : " + job);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
		System.out.println("혈액형 : " + blood);
		System.out.println(); // 내려쓰기
	}
}
