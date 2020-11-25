package ch07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Hash03 {

	public static void main(String[] args) {
		// 랜덤으로 숫자를 생성해주는 클래스
		Random r = new Random();
		ArrayList<Integer> lotto = new ArrayList<>(6);
		while(true) {
			int num = r.nextInt(45) + 1;	// 0 부터 시작
			if(!lotto.contains(num)) {
				lotto.add(num);
			}
			
			if(lotto.size() == 6)
				break;
		}
		
		Iterator<Integer> it = lotto.iterator();
		while(it.hasNext()){	//값이 있으면 true 없으면 false
			System.out.print(it.next() + " ");// 현재 인덱스의 값을 리턴 + 인덱스 증가
		}
		System.out.println();
		System.out.println(lotto);
		
	}

}
