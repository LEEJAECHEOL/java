package ch03;

public class For04 {

	static void startPrint2(int num) {
		for (int i = num; i > 0; i--) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void startPrint3(int num) {
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num-1; i > 0; i--) {
			for (int j = 0; j <i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	static void startPrint4(int num) {
		for (int i = 1; i < num; i++) {
			for (int j = 1; j < num - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 1; i < num; i++) {
			for (int k = 0; k < i ; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j < (num - i) * 2 - 2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		startPrint2(5);
		startPrint3(5);
		startPrint4(3);
	}

}
