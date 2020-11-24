package review;

/*
 * @author 이재철
 * Static 은 메인이 시작하기 전에 메모리에로딩한다.
 * 그 말은 static데이터는 중복 될 수 없음. 단 한번만 메모리에 로딩되기 때문!!
 * 두개가 메모리에 뜰 수 없음 => static데이터는 공유될 수 있는 데이터
 * 
 *heap은 new할 때 메모리에 뜬다. 타이밍이 무조건 static보다 늦음.
 * 개발자가 원하는 만큼 메모리에 로딩함.
 * 공유 데이터가 아니고 각각이 데이터를 따로 가지고 있음.
 * 자동차 공장에서 소나타를 3대를 찍어내서 판매를 하면 3개의 소나타는 다른 소나타.
 * */

public class Ex07 {
	int num = 10; // 안뜸 new 해야 뜸 heap 변수, 필드, 프로퍼티
	static int sum = 20;	// 메인이 시작되기 전에 뜸.
	
	public static void main(String[] args) {
		System.out.println(Ex07.sum);

		Ex07 e = new Ex07();
		System.out.println(e.num);
		
	}

}
