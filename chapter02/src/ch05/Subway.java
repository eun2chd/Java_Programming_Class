package ch05;

public class Subway {
	
	int subNumber;
	int subGuest;
	int subMoney;
	
	int count;
	
	
	public  Subway(int Number){  // [������] - ȣ����ȣ �Ű������� ����
		
		this.subNumber = Number;
		
	}
	
	public void take(int money) {  // [�޼���] �°��� �¿�鼭 ���� �޴� ���� 
			
		this.subMoney += money;
		subGuest++;
		
	}
	
	public void showInfo() {  // [�޼���]  ȣ������ ���
			
			System.out.println("----- ȣ �� �� �� -----");
			System.out.println("ȣ�� ��ȣ : " + subNumber);
			System.out.println("�°��� : " + subGuest);
			System.out.println("���ͱ� : " + subMoney);
	
	}
	
	
}
