package ch01;

public class WarriorMainTest {

	
	// �����  Ŭ������ ����ϴ� �� �ڵ�
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int height; // main �ȿ� ������ ������ ���� ����
		
		
		Warrior w1 = new Warrior();
		
		w1.heigt = 200;
		w1.power = 100;
		w1.name = "����1";
		w1.color = "�ʷϻ�";
		
		
		System.out.println(w1.heigt);
		System.out.println(w1.power);
		System.out.println(w1.name);
		System.out.println(w1.color);
		
		Warrior w2 = new Warrior();
		
		w2.heigt = 100;
		w2.power = 50;
		w2.name = "��������1";
		w2.color = "������";
				
		System.out.println(w2.heigt);
		System.out.println(w2.power);
		System.out.println(w2.name);
		System.out.println(w2.color);
				
				
				
	} // end of main

} // end of class
 