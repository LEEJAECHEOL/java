package ch04;

import java.util.Scanner;

public class Example12 {

	public static void main(String[] args) {
		String[][] seat = {{"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},{"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"},{"---", "---", "---", "---", "---", "---", "---", "---", "---", "---"}};
		int gubun;
		char[] row = {'S', 'A', 'B'};
		int seatGubun;
		String name = "";
		int num;
		boolean stop = true;
		String s;
		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		
		System.out.println("명품콘서트홀 예약 시스템입니다.");
		while(stop) {
			System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >> ");
			gubun = sc.nextInt();
			switch (gubun) {
			case 1:
				System.out.print("좌석 구분 S(1), A(2), B(3) >> ");
				seatGubun = sc.nextInt();
				s = "";
				s += row[seatGubun - 1];
				for(int i = 0; i < 10; i++ ) {
					s += seat[seatGubun - 1][i];
				}
				System.out.println(s);
				System.out.print("이름 >> ");
				name = sc2.nextLine();
				
				System.out.print("번호 >> ");
				num = sc3.nextInt();
				seat[seatGubun - 1][num - 1] = name;
				
				break;
			case 2:
				for(int i = 0; i < 3; i++) {
					s = "";
					s += row[i];
					s += "  >> ";
					for(int j = 0; j < 10; j++) {
						s += seat[i][j];
						s += "   ";
					}
					System.out.println(s);
				}
				System.out.println("<<조회를 완료하였습니다.>>");
				break;
			case 3:
				System.out.println("좌석 S : 1, A : 2, B : 3");
				seatGubun = sc.nextInt();
				s = "";
				s += row[seatGubun - 1];
				for(int i = 0; i < 10; i++ ) {
					s += seat[seatGubun - 1][i];
				}
				System.out.println(s);
				System.out.print("이름 >> ");
				name = sc2.nextLine();
				System.out.println(name);
				for(int i = 0; i < 10; i ++) {
					if(seat[seatGubun - 1][i].equals(name)) {
						seat[seatGubun - 1][i]  = "---";
						break;
					}
				}
				break;
			case 4:
				stop = false;
				break;
			}
		}
	}

}
