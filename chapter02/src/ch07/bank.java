package ch07;

public class bank {
	
	// ��������
	private int balane;
	
	
	// �Ա� ��� 
	public void deposit(int money) {
		
//		this.balane = this.balane + money;
		this.balane += money;
		
		
	}
	
	// ��� ���
	public int withdraw(int money) {
		
		this.balane -= money;
		return money;
		
		
	}
	
	
	public void showBank() {
		
		System.out.println("���� �ܾ��� : " + this.balane + "�Դϴ�.");

		
	}
	

	// getter �޼��� �����
	// �Ϲ������� get() �ż��带 ���� �ܺο��� Ȯ���� �� �ֵ��� �����Ѵ�.
	public int getBalane() {
		
		return this.balane;
		
	}
	
	// setter �ż��� �����
	// �Ϲ��� set() �޼��带 �����ؼ� �ܺο��� ��� ������ ������ �� �ֵ��� ����
	
	public void setBalane(int balance) {
		
		if(balance < 0) {
			System.out.println("�߸��� �Է�");
		}
		else {
			this.balane = balance;
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
