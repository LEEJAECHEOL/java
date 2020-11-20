package ch06;

public class Object02 {

	
	
	public static void main(String[] args) {
		
		// 해시함수는 임의의 길이의 데이터를 고정된 길이의 데이터로 매핑하는 함수
		// 복호화가 불가능
		// 해시는 충돌날 수 있다. 
		// 해시는 전자서명에 쓰인다.(원본증명)
		// heap영역을 비교할 수 있다.
		String str = "HongGilDong";
		System.out.println(str.hashCode());
		
		String str2 = "HongGilDong";
		System.out.println(str2.hashCode());
		
		str = "임꺽정";
		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
	}

}
