package ch03;

public class For05 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0) {
				sum = sum + i;
			}else {
				continue;
			}
		}
		System.out.println("3의 배수 합 : " + sum);
		
	}

}
