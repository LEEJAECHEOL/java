package ch05;

public class SportCar extends Car implements Controll {
	private String name;
	private Engine5000 engine5000;
	
	@Override
	public void 엑셀() {
		System.out.println("전진");
	}
	@Override
	public void 브레이크() {
		System.out.println("멈춤");
	} 
	
	
}
