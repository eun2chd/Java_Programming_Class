package ch05;

class BankAccount {

	private int money = 100_000;

	public int getMoney() {

		return this.money;
	}

	public void setMoney(int money) {

		if (money <= 0) {
			System.out.println("�߸��� �Է��Դϴ�.");
		} else {
			this.money = money;
		}

	}

	public void saveMoney(int money) {

		synchronized (this) {
			int currentMoney = getMoney();
			System.out.println("�޼��� ����");
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

	public synchronized void withdrawMoney(int money) {

		int currentMoney = getMoney();
		System.out.println("�޼��� ���� Ȯ��");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(currentMoney - money);
		System.out.println("��� �� ���� �ܾ� : " + getMoney());

	}

} // end of class

class Father extends Thread {

	BankAccount account;

	public Father(BankAccount account) {
		this.account = account;

	}

	@Override
	public void run() {

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

		account.withdrawMoney(5_000);
	}

}

public class SharedResource {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		Father father = new Father(account);
		Mother mother = new Mother(account);

		father.start();
		mother.start();

	}

}
