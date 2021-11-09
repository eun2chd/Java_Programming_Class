package ch09;


// extends 는 하나만 할 수 있다
public class Refrigerator extends HomeAppliances implements RemoteController, SoundEffect{
	
	
	@Override
	public void turnOn() {

		System.out.println("냉장고를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		
		System.out.println("냉장고를 끕니다.");
		
		
	}

	@Override
	public void notification() {
		
		System.out.println("띠리링~");
	}

	
	
	
	
}
