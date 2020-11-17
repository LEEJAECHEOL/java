package ch02;

public class Var01 {
	// java는 .class파일을 실행하면 static부분을 메모리에 로드한다 (static공간)
	//static공간에 있는 main() 함수를 찾아서 호출하고
	// 이때 stack이 생성되는데 이 stack의 이름은 main이라고한다.
	// main이 stack 종료되면 프로그램 종료!!
	public static void main(String[] args) {
		// Code 함수가 호출되면 내부를 스택이라하는데 이 스택은 함수가 종료될 때까지만 쓴다.
		
		System.out.println("첫번째");
		System.out.println("두번째");
	} // end of main

}
