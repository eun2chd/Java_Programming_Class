package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����� continue
		// �����ϰ� �����ϴ� continue
		// ��ĳ�� �̿��ؼ� MAX �� , MULTIPLE �� �޾Ƽ� ���α׷��� �ϼ��ϼ���
		
		
		final int MAX;
		final int MULTIPLE;
		final int MIN = 1;
		
		int num;
		int count = 1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("MAX  : ");
		MAX = scanner.nextInt();
		
		System.out.println("MULTIPLE  : ");
		MULTIPLE = scanner.nextInt();
	
		for(num = MIN; num < MAX; num++ ) {
			
			
			if(num % MULTIPLE == 0)
			{
				count++;
				continue;
		
			} // end of if
		
			
		} // end of for
		
//		System.out.println("��°� : " + num);
		System.out.println(MULTIPLE + "�� ��� ���� : " + count);
		
	} // end of main


} // end of class
