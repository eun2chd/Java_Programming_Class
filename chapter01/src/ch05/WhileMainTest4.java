package ch05;

import java.util.Scanner;

public class WhileMainTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// do while 사용
		// scanner 사용해서 사용자에 입력값을 받아서 덧셈 연산.
		// 연산의 결과를 화면에 출력하는 프로그램을 만들어 주세요.
		
		int sum = 0;
		int su;
		
		Scanner scanner = new Scanner(System.in);
	
	/*	do {
			
			System.out.println("숫자 입력");
			su = scanner.nextInt();
			System.out.println();
			sum += su;
			System.out.println("누적 값 : " + sum);
			
			
		}while(su != 0);
		
		

	} // end of main

} // end of class
*/
		int num = 0;
		
		do {
			
			System.out.println("숫자 입력");
			su = scanner.nextInt();
			num += su;
		
		}while(su != 0);
		
		System.out.println("결과값 : " + num);
	
		
		
		
//		for(int i = 0; i  < 3; i++) {
//			
//			System.out.println("숫자 입력");
//			su = scanner.nextInt();
//			num += su;
//			
//		}
//		System.out.println("결과값 : " + num);
//		
		
		
	}
}












