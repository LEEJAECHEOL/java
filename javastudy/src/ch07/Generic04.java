package ch07;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
class Error {
	private String msg;
}

@AllArgsConstructor
@Data
class User {
	private int id;
	private String username;
}

@AllArgsConstructor
@Data
// T 는 클래스 옆에 붙혀쓴다.  
class RespDto<T> {
	private int code; // 200(정상), 400(실패)
	private T data;
}

public class Generic04 {
	//	<?> 타입이 정해져 있지 않음. 함수에서 리턴할 때  ? 사용
	static RespDto<?> getData(String username) {
		if(username.equals("ssar")) {
			RespDto<User> dto = new RespDto(200, new User(1, "ssar"));
			return dto;
		}else {
			RespDto<Error> dto = new RespDto(400, new Error("아이디가 틀렸습니다."));
			return dto;
		}
	}
	
	public static void main(String[] args) {
		RespDto<?> dto = getData("ssar");
		System.out.println(dto.getCode());
		System.out.println(dto.getData());
	}
}
