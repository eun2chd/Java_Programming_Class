package ex2;

public class BugerBuy {
	
	// �ܹ������̸�
	// ���ͱ�
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
		
		System.out.println("--- ������ ���� ---");
		System.out.println(bugerHomeName);
		System.out.println("���ͱ� : " + money);
		System.out.println("�մ� : " + bugerCount);
		
		
	}
	
	
	

}
