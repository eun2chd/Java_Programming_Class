package ch07;

public class bank {
	
	// 정보은닉
	private int balane;
	
	
	// 입금 기능 
	public void deposit(int money) {
		
//		this.balane = this.balane + money;
		this.balane += money;
		
		
	}
	
	// 출금 기능
	public int withdraw(int money) {
		
		this.balane -= money;
		return money;
		
		
	}
	
	
	public void showBank() {
		
		System.out.println("현재 잔액은 : " + this.balane + "입니다.");

		
	}
	

	// getter 메서드 만들기
	// 일반적으로 get() 매서드를 만들어서 외부에서 확인할 수 있도록 구현한다.
	public int getBalane() {
		
		return this.balane;
		
	}
	
	// setter 매서드 만들기
	// 일반적 set() 메서드를 제공해서 외부에서 멤버 변수에 접근할 수 있도록 구현
	
	public void setBalane(int balance) {
		
		if(balance < 0) {
			System.out.println("잘못된 입력");
		}
		else {
			this.balane = balance;
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
