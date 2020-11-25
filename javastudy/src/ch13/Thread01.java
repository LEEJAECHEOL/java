package ch13;

// 스래드는 ux땜에 씀

class Another implements Runnable {	// Runnable 타입이 되어야 함.
	
	// 실행단위 코드블록 = 스텍 (스레드)
	@Override
	public void run() {
		System.out.println("new Thread 실행됨");
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("new : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("new Thread End");
	}
	
}

public class Thread01 {

	public static void main(String[] args) {
		System.out.println("main Thread 실행됨");
		
		// 새로운 스레드 실행
		// 1. 스레드 객체 생성  2. 타겟 생성  3. 실행
		Thread t1 = new Thread(new Another());
		t1.start();
		
		
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println("main : " + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("main Thread End");
	}

}



