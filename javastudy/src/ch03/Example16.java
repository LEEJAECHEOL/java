package ch03;

import java.util.Scanner;

public class Example16 {

	public static void main(String[] args) {
		String[] str = {"가위", "바위", "보"};
		Scanner s = new Scanner(System.in);
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		boolean check = true;
		String myValue;
		while(check) {
			System.out.print("가위 바위 보! >> ");
			myValue = s.nextLine();
			if(myValue.equals("그만")) {
				check = false;
				continue;
			}
			int n = (int)(Math.random() * 3);
			int myNum = 0;
			for(int i = 0; i < 3; i++) {
				if(str[i].equals(myValue)) {
					myNum = i;
				}
			}
			
			if(myNum == n) {
				System.out.println("user : " + myValue + ", computer : " + str[n] + ", 비겼습니다.");
			} else if(myNum == 0 && n == 1) {
				System.out.println("user : " + myValue + ", computer : " + str[n] + ", 컴퓨터가 이겼습니다.");
			} else if(myNum == 0 && n == 2) {
				System.out.println("user : " + myValue + ", computer : " + str[n] + ", 사용자가 이겼습니다.");
			}else if(myNum == 1 && n == 0) {
				System.out.println("user : " + myValue + ", computer : " + str[n] + ", 사용자가 이겼습니다.");
			} else if(myNum == 1 && n == 2) {
				System.out.println("user : " + myValue + ", computer : " + str[n] + ", 컴퓨터가 이겼습니다.");
			}else if(myNum == 2 && n == 0) {
				System.out.println("user : " + myValue + ", computer : " + str[n] + ", 컴퓨터가 이겼습니다.");
			}else {
				System.out.println("user : " + myValue + ", computer : " + str[n] + ", 사용자가 이겼습니다.");
			}
			
		}
	}

}
