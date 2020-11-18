package ch03;

import java.util.Scanner;

public class Example03 {

	public static void main(String[] args) {
		int[] price = {50000, 10000, 1000, 100, 50, 10, 1};
		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하시오 >> ");
		int money = sc.nextInt();
		for(int i = 0; i < price.length; i++) {
			if(money >= price[i]) {
				System.out.println(price[i] + "원권 " + money/price[i] + "매");
				money %= price[i];
			}
		}		
	}

}
