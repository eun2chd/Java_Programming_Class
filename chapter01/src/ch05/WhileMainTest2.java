package ch05;

import java.util.Scanner;

public class WhileMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 상수에 담는 값을 스캐너를 사용해서 코드를 수정해 주세요.
		
	
		
		final int LIMIT_VLAUE;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		LIMIT_VLAUE = scanner.nextInt();
		
		int num = 1;
		int sum = 0;
		
		while(num <= LIMIT_VLAUE) {
			
			sum = sum + num;
			num++;
			
		}
		
		System.out.println("결과값 : " + sum);

	}

}
