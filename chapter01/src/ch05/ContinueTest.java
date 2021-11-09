package ch05;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 예약어 continue
		// 무시하고 진행하는 continue
		// 스캐너 이용해서 MAX 값 , MULTIPLE 값 받아서 프로그램을 완성하세요
		
		
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
		
//		System.out.println("출력값 : " + num);
		System.out.println(MULTIPLE + "의 배수 갯수 : " + count);
		
	} // end of main


} // end of class
