package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

class Song {
	private String title;
	private String artist;
	private int year;
	private String country;
	void show() {
		System.out.println(getYear() + "년 " + getCountry() + "국적의 "  + getArtist() + "가 부른 " +getTitle());
	}
}

public class Example03 {

	public static void main(String[] args) {
		Song s = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		s.show();
	}

}
