package ch03;

public class Warrior {
	
	// ��� ���� ����
	
	String WarName; // ���� �̸�
	int Attack;  // ���� ���ݷ�
	int Defense; // ���� ����
	int PhysicalStrength; // ���� ü��
	int MANA; // ���� ����
	String Color; // ���� ����
	
	
	
	
	
	public void ShowWarName() {
		
			System.out.println("----info----");
			System.out.println("�̸� : " + WarName );
		
	}
	
	public void ShowDefense() {
			
			System.out.println("���� : " + Defense);
		
	}
	
	public void ShowPhysicalSt() {
		
			System.out.println("ü�� : " + PhysicalStrength);
			
	}
	
	public void ShowMana() {
		
			System.out.println("���� : " + MANA);
	}
	

	public static int Attack(int num) {
		
			int sum = 0;
			
			for(int i = 0; i < num; i++)
			{
				sum += i;
			
			}
			return sum;
			
	}
	

	public String ShowColor() {
		
			return Color;
		
	}

	
		
	
	
	
	// ��� �Լ�
	
	

}
