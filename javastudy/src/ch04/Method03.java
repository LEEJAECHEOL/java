package ch04;


class Cal {
	
	static void add(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	static int mainus(int n3, int n4) {
		return (n3 - n4);
	}
}

public class Method03 {
	public static void main(String[] args) {
		Cal.add(10, 10);
		
		// minus 함수는 return타입이 int이기 때문에
		// Cal.minus(10, 4)가 호출된 후 메서드가 종료되면
		// Cal.minus(10, 4) ---> 6으로 변경된다.
		int result = Cal.mainus(10, 4);
		System.out.println(result);
	}
}
