package ch02;

public class Var2 {
	public static void main(String[] args) {
		// Code Part
		
		int num = 10;	// 4byte -> 32bit -> 42억 9천 (-20억 ~ +20억)
		long num2 = 100; // 8byte
		
		char s = 'A'; // 2byte
		
		double d = 7.5; // 8byte 42d억 9천 -20억 ~ 2억 추가로 소수점 이하의 값 입력가능
		
		boolean b = true; // 1bit  	true or false
		
		num = (int)d; // 소수점을 넣을때 소수점은 버린다,명시적 형변환  다운캐스팅 자료유실 
		num = (int)num2; // 명시적 형변환  다운캐스팅
		num2 = num; // 묵시적 형변환 		업캐스팅
		
	} // end of main

}
