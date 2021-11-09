package ch07;

public abstract class Car {
	
	public void startCar() {
		
		System.out.println("시동을 켭니다.");
		
		
	}
public void turnOff() {
		
		System.out.println("시동을 끕니다.");
		
	}
	
	public abstract void drive();
	
	public abstract void stop();
	
	public abstract void wiper();
	
	
	// 후크(hook) 메서드
	public void washCar() {
		
		
	}
	
	// 핵심
	// 하위 클래스에서 재정의 할 수 없게 해야한다.
	// final 을 사용하면 하위클래스 에서 재정의 할수 없다.
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		wiper();
		washCar();
	
	}
	
	
	
	

}
