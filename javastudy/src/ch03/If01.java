package ch03;

public class If01 {

	public static void main(String[] args) {

		// 표현식
		if (true) {
			System.out.println("true");
		}
		if(false) {
			System.out.println("not execute");
		}
		int num = 0;
		if(num > 1) {
			System.out.println("num is bigger than 1");
		}else { // 그게 아니라면
			System.out.println("num is shortter than 1");
		}
		
		int sum = 30;
		if (sum == 10) {
			System.out.println("sum is 10");
		}else if (sum == 20) {
			System.out.println("sum is 20");
		} else {
			System.out.println("sum is 30");
		}
		
	}

}
