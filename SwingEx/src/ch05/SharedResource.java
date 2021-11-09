package ch05;

class BankAccount {

	private int money = 100_000;

	public int getMoney() {

		return this.money;
	}

	public void setMoney(int money) {

		if (money <= 0) {
			System.out.println("잘못된 입력입니다.");
		} else {
			this.money = money;
		}

	}

	public void saveMoney(int money) {

		synchronized (this) {
			int currentMoney = getMoney();
			System.out.println("메서드 동작");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			setMoney(currentMoney + money);
			System.out.println("입금 후 계좌 잔액 : " + getMoney());
		}

	}

	public synchronized void withdrawMoney(int money) {

		int currentMoney = getMoney();
		System.out.println("메서드 동작 확인");

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		setMoney(currentMoney - money);
		System.out.println("출금 후 계좌 잔액 : " + getMoney());

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
