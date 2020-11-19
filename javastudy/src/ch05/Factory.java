package ch05;

public abstract class Factory {
	protected abstract void 색칠();
	protected void dry() {
		System.out.println("dry complete!!!");
	}
	public void run() {
		색칠();
		dry();
	}
}
