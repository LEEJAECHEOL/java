package ch07;

import java.util.Vector;

public class Generic03 {

	public static void main(String[] args) {
		// 동기화(일에 순서가 있음) 되어있는 임계(위험)구역  (동시접근 불가능)
		Vector<Integer> list = new Vector<>();
		// 사용법 arraylist 와 동일
		
		list.add(100);
		list.add(200);
		list.add(1, 300);
		
		System.out.println(list.get(1));
		
		
	}

}
