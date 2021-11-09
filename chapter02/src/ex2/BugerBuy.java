package ex2;

public class BugerBuy {
	
	// 햄버거집이름
	// 수익금
	// 
	
	String bugerHomeName;
	int money;
	int bugerCount;
	
	
	public BugerBuy(String bugerHomeName) {
		
		this.bugerHomeName = bugerHomeName;
		
		
		
		
	}
	
	
	
	public void Oderbuy(int money) {
		
		this.money += money;
		bugerCount++;
				
	}
	
	
	public void showOderShowInfo() {
		
		System.out.println("--- 버거집 정보 ---");
		System.out.println(bugerHomeName);
		System.out.println("수익금 : " + money);
		System.out.println("손님 : " + bugerCount);
		
		
	}
	
	
	

}
