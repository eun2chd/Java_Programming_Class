package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����� ��� ���� ��ĳ�ʸ� ����ؼ� �ڵ带 ������ �ּ���.
		
	
		
		final int LIMIT_VLAUE;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���");
		LIMIT_VLAUE = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VLAUE) {
			
			sum = sum + num;
			num++;
			
		}
		
		System.out.println("����� : " + sum);

	}

}
