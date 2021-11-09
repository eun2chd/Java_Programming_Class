
package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank bank = new bank();
		
		// 멤버 변수 성질
		// int -> 0
		// double --> 0.0
		// String --> null
		
		bank.deposit(10_000);
		bank.showBank();
		int money = bank.withdraw(5000);
		

		System.out.println("돌려 받은 금액 " + money);
		bank.showBank();
//		bank.balane = 100_000;
		bank.showBank();
		
		// getter, setter
		// only read
		
		
		int returnMoney = bank.getBalane();
		System.out.println(returnMoney);
	
		
		// setter 사용해기
		bank.setBalane(-10000);
		bank.showBank();
		
		// 접근 제어 지시자
		// 4
		// public - 누구나 접근을 허용한다.
		// default - 같은 패키지 내에서 접근을 허용
		// protected - 상속관계에서 접근을 허용한다.
		// private - 같은 클래스 에서만 접근을 허용한다.
		
		

	}

}
