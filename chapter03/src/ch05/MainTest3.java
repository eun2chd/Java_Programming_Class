package ch05;

import ch04.person;

public class MainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ������ : �迭(�ڷᱸ��) ���迡���� ����� ����
		// �ϳ��� ������ ������ �����͸� ������ ���� �ϱ� ���� ���
		
		// 
		
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();
		
		Banana[] bananaBuket = new Banana[2];
		bananaBuket[0] = banana1;
		bananaBuket[1] = banana2;
		
		
		for (Banana banana : bananaBuket) {
			
			banana.showInfo();
	
			
		}
		
		// �迭�� ����ؼ� ���
		// �迭�� 2ĭ
		
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		
		Peach[] peachBuket = new Peach[2]; 
		peachBuket[0] = peach1;
		peachBuket[1] = peach2;
		

//		for (Peach peach : peachs) {
//			
//			peachs.showinfo();
//				
//		}
		
		Fruit[] fruitBuket = new Fruit[4];
		fruitBuket[0] = banana1;
		fruitBuket[1] = peach1;
		fruitBuket[2] = banana2;
		fruitBuket[3] = peach2;
		
		for (Fruit fruit : fruitBuket) {
			fruit.showInfo();
		}
		

	}

}
