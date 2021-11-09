package ch05;

public class Subway {
	
	int subNumber;
	int subGuest;
	int subMoney;
	
	int count;
	
	
	public  Subway(int Number){  // [생성자] - 호선번호 매개변수로 받음
		
		this.subNumber = Number;
		
	}
	
	public void take(int money) {  // [메서드] 승객을 태우면서 돈을 받는 행위 
			
		this.subMoney += money;
		subGuest++;
		
	}
	
	public void showInfo() {  // [메서드]  호선정보 출력
			
			System.out.println("----- 호 선 정 보 -----");
			System.out.println("호선 번호 : " + subNumber);
			System.out.println("승객수 : " + subGuest);
			System.out.println("수익금 : " + subMoney);
	
	}
	
	
}
