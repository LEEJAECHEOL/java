package ch03;

import java.util.Scanner;

public class Example06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오 >> ");
		String value = sc.nextLine();
		int count = 0;
		for(int i = 0; i < value.length(); i++) {
			if((value.charAt(i)) == '3' || (value.charAt(i)) == '6' || (value.charAt(i)) == '9') {
				count++;
			}
		}
		if(count == 1) {
			System.out.println("박수짝");
		}else {
			System.out.println("박수짝짝");
		}
		
		
	}

}