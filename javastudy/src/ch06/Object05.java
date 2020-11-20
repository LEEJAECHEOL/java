package ch06;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor  // 생산
@Data  // getter setter toString
@NoArgsConstructor  // 디폴트 생산자

class User2 {
	private int id;
	private String username;
}
public class Object05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User2 user = new User2(1, "ssar");
		System.out.println(user);
	}

}
