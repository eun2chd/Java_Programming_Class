package ex2;

public class Bus {
	
	int busnumeber;
	int busmoney;
	int guest;
	
	
	public Bus(int busnumber) {
			
		this.busnumeber = busnumber;
		
		
	}
	
	
	
	
	
	public void takeBus(int busmoney) {
		
		this.busmoney += busmoney;
		guest++;
		
	}
	
	public void showInfo() {
		
			System.out.println("���� ����");
			System.out.println("�°� �� : " + guest);
			System.out.println("���� : " + busmoney);
			
	}
	
	
	

}
