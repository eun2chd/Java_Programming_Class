package ch05;

import java.util.Scanner;

public class MainTest2 {
	
	public static void main(String[] args) {
		
	
	
		final int BANANA =1;
		final int PEACH = 2;
		
		// ��ĳ��
		// ����ڰ� �Է��� 1,2  ������ �ش��ϴ� ��ü�� ������
		// ȭ�鿡 ���
		
		System.out.println("�ٳ��� : 1 , ������ : 2");
		
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Fruit fruit;
		
		
		if(num == BANANA) {
			
			fruit = new Banana(); // �� ĳ����
		
			
		}
		else
		{
	
			fruit = new Peach();
		
		}
		
		fruit.showInfo();
		
		// ����ڰ� �Է��� ���� ���� �ν��Ͻ��� ���� 
		// �ٲ� �ټ� �ִ�.
		
		// ���� 1���̶�� �ٳ��� ��ü�� ����
		// showinfo �ż��� ȣ��
		
		
		// TODO Auto-generated constructor stub
	}

}
