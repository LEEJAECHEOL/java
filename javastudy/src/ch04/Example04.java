package ch04;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

class Rectangle {
	private int x, y, width, height;
	
	void show() {
		System.out.println("(" + getX()  + ", " + getY() + ")에서 크기가 " + getWidth() + "x" + getHeight() + "인 사각형");
	}
	int square() {
		return getWidth() * getHeight();
	}
	Boolean contains(Rectangle r) {
		if((getX() <= r.getX() && getY() <= r.getY()) && (getWidth() + getX() >= r.getWidth() + r.getX() && getHeight()  + getY() >= r.getHeight() + r.getY()) ) {
			return true;
		}else {
			return false;
		}
		
	}
}


public class Example04 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		
		r.show();
		System.out.println("s의 면적은 " +s.square());
		if(t.contains(r)) {
			System.out.println("t는 r을 포함합니다.");
		}
		if(t.contains(s)) {
			System.out.println("t는 s을 포함합니다.");
		}
	}

}
