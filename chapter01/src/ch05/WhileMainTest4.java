package ch05;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// do while ���
		// scanner ����ؼ� ����ڿ� �Է°��� �޾Ƽ� ���� ����.
		// ������ ����� ȭ�鿡 ����ϴ� ���α׷��� ����� �ּ���.
		
		int sum = 0;
		int su;
		
		Scanner scanner = new Scanner(System.in);
	
	/*	do {
			
			System.out.println("���� �Է�");
			su = scanner.nextInt();
			System.out.println();
			sum += su;
			System.out.println("���� �� : " + sum);
			
			
		}while(su != 0);
		
		

	} // end of main

} // end of class
*/
		int num = 0;
		
		do {
			
			System.out.println("���� �Է�");
			su = scanner.nextInt();
			num += su;
		
		}while(su != 0);
		
		System.out.println("����� : " + num);
	
		
		
		
//		for(int i = 0; i  < 3; i++) {
//			
//			System.out.println("���� �Է�");
//			su = scanner.nextInt();
//			num += su;
//			
//		}
//		System.out.println("����� : " + num);
//		
		
		
	}
}












