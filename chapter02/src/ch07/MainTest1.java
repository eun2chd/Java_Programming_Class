
package ch07;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bank bank = new bank();
		
		// ��� ���� ����
		// int -> 0
		// double --> 0.0
		// String --> null
		
		bank.deposit(10_000);
		bank.showBank();
		int money = bank.withdraw(5000);
		

		System.out.println("���� ���� �ݾ� " + money);
		bank.showBank();
//		bank.balane = 100_000;
		bank.showBank();
		
		// getter, setter
		// only read
		
		
		int returnMoney = bank.getBalane();
		System.out.println(returnMoney);
	
		
		// setter ����ر�
		bank.setBalane(-10000);
		bank.showBank();
		
		// ���� ���� ������
		// 4
		// public - ������ ������ ����Ѵ�.
		// default - ���� ��Ű�� ������ ������ ���
		// protected - ��Ӱ��迡�� ������ ����Ѵ�.
		// private - ���� Ŭ���� ������ ������ ����Ѵ�.
		
		

	}

}
