package ch05;

public class mainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Banana banana = new Banana();
		Peach peach = new Peach();
		
		banana.showInfo();
		peach.showInfo();
		
		// 자바에서 다형성이란
		// 부모 타입 인스턴스 변수에 자식 객체를 생성할 수 있다.
		
		
		Fruit fruit = new Banana(); // 업 캐스팅
		
		fruit.showInfo();
		
		// 부모 자식 관계에서만 사용가능
		
		// 그 역은  성립하지 않는다.
		
		// 즉 자식 인스턴스 변수에(참조변수) 부모 인스턴스를 생성 불가
		
		
		
				
		
		
		

	}

}
