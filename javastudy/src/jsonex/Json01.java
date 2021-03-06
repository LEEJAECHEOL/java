package jsonex;

import com.google.gson.Gson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
class Comment {
	private int id;
	private String name;
	private String content;
}

public class Json01 {

	public static void main(String[] args) {
		Comment c = new Comment(1, "test", "comment1");
		Gson g = new Gson();
		// java -> json
		String strJson = g.toJson(c);
		System.out.println(strJson);
		// json -> java
		Comment c2 = new Comment();
		c2 = g.fromJson(strJson, Comment.class);
		
		System.out.println(c2);
		
		// 객체 배열
		Comment[] cArray = new Comment[5];
		for (int i = 0; i < cArray.length; i++) {
			cArray[i] = new Comment(i, "test" + i, "comment" + i);
		}
		String strJson2= g.toJson(cArray);
		System.out.println(strJson2);
		
		Comment[] c3 = new Comment[5];
		c3 = g.fromJson(strJson2, Comment[].class);
		
		System.out.println(c3[0]);
		System.out.println(c3[1]);
		System.out.println(c3[2]);
		System.out.println(c3[3]);
		System.out.println(c3[4]);
		
	}

}
