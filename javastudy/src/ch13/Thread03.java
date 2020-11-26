package ch13;

public class Thread03 {
	static int sum = 0;
	
	static class NewThread implements Runnable {
		@Override
		public void run() {
			System.out.println("new Thread Start");
			for (int i = 0; i < 10; i++) {
				sum = sum + 10;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("new Thread End");
		}
		
	}

	public static void main(String[] args) {
		System.out.println("main thread start");
		
		Thread t1 =  new Thread(new NewThread());
		
		t1.start();
		try {
			t1.join();	// t1이 끝날 때 까지 대기
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sum);
		System.out.println("main thread end");
	}

}
