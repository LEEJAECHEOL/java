package ch03;

import java.util.Scanner;

public class Example04 {

	public static void main(String[] args) {
		int[] val = new int[3];
		Scanner sc = new Scanner(System.in);
		int result = 0, max, min;
		
		System.out.print("정수 3개 입력 >> ");
		for(int i = 0; i < 3; i++) {
			val[i] = sc.nextInt();
		}
		min = val[0];
		max = val[0];
		for(int i = 1; i < 3; i++) {
			if(min > val[i]) {
				min = val[i];
			}
			if(max < val[i]) {
				max = val[i];
			}
		}
		for(int i = 0; i < 3; i++) {
			if(val[i] != max || val[i] != min) {
				result = val[i];
			}
		}
		System.out.println("중간 값은 " + result);
	}

}
