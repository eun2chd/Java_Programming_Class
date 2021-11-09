package ch04;

class BankAccount {
	
	private int money = 100_000;
	
	//getter
	public int getMoney() {
		
		return this.money;
			
	}
	
	
	//setter
	
	
	public void setMoney(int money) {
		
		if(money <= 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		}else {
			this.money = money;			
		}
	}
	
	// �Աݱ��
	public  void saveMoney(int money) {
		// 10 ���� ����
		
	// ���� �����ؼ� lock �� �Ŵ� ����
		synchronized(this) {
			int currentMoney = getMoney();
			System.out.println("�޼��� ���� Ȯ��1 : saveMoney");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(currentMoney + money);
			System.out.println("�Ա� �� ���� �ܾ� : " + getMoney());
			
		}
	}
			

		
	
	
	// ��� ���
	public synchronized void withdrawMoney(int money) {
		
		int currentMoney = getMoney();
		System.out.println("�޼��� ���� Ȯ��2 : withdrawMoney");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		// ����� �ڵ�
		// To do 
		// ���� �ݾ׺��� ����Ϸ��� �ݾ� ũ�� ��� �ȵǰ� ����
		
		setMoney(currentMoney - money);
		System.out.println("��� �� ���� �ܾ� :" + getMoney());
		
	}
	
	

} // end of bankAccount class

class Father extends Thread {
	
	BankAccount account;
	
	public Father(BankAccount account) {
			this.account = account;
			
	}
	
	@Override
	public void run() {
//		���� �Ա��ϴ� ���� 
//		�Ա��ϱ�
		account.saveMoney(10_000);
	    
	}
	
	
}

class Mother extends Thread {
	
	BankAccount account;
	
	public Mother(BankAccount account) {
		this.account = account;
		
		}
	
	@Override
	public void run() {
		
		// ����ϱ�
		account.withdrawMoney(5_000);
	
	}
	
	
}





public class SharedResource {

	public static void main(String[] args) {
		
		// ���� 10������ ���� �Ǿ� �ִ� ���·� ��ü ����
		BankAccount account = new BankAccount();
		
		Father father = new Father(account);
		Mother mother = new Mother(account);
		
		// �ƹ����� �Ա��ϴ� ����
		father.start();
		// ������ ����ϴ� ����
		mother.start();
		
		// ���� ó�� �ݾ� : 10�� + -(����) - (��õ��)   = 10�� 5õ��
		// ����� : 11�� ?? <- �ǵ�ġ ���� ����� ���� �� �ִ�.
		// ���� ?? �ð��� �帧�� ���� 
		
		// ����ȭ
		// �Ӱ� ������ �߻��� ���� (�۾��ڰ��� �ڿ��� �����ϴ� ����)
		// ���� �ڿ�(������) ����ϰ� �ֱ� ������ ��ȣ ó���� ���־�� �Ѵ�.
		// �ٸ� �۾��ڰ� ������� ���ϵ��� lock�� �ɾ��ش�.
		// ������ ���Ѽ� �۾��� �ϰ� �Ѵ�.
		
		// ���
		//ù��° synchronized �޼���
		//�ι�° synchronized ���
		
		
	}
	
}
