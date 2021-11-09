package ch03;

public class mainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동차를 생성해서 show info 호출
		
		Car car1 = new Car("아우디" , 300_000_000);
		
		car1.showInfo();
		car1.engine.showInfo();
		
		
		

	}

}
