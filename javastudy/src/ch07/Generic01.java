package ch07;

import lombok.Data;

@Data


// 제네릭 <T>
class ResponseDto <T>{
	private int statusCode;	// 200 (성공), 300 (다시요청), 400 (잘못된 요청)
	private T data;
}
//
//class Dog {
//	String name = "hello";
//}

public class Generic01 {

	public static void main(String[] args) {
		ResponseDto <String> dto = new ResponseDto();
		dto.setStatusCode(200);
		dto.setData("apple");
		
		
		
		
//		dto.setData(new Dog());
		
		// 복잡해서 사용 안함
//		Object b = new Dog();
//		Dog dd = (Dog)b;
//		System.out.println(dd.name);
		
		System.out.println(dto.getStatusCode());
		
		
		if(dto.getStatusCode() == 200) {
			System.out.println(dto.getData());
		}
		
	}
}
