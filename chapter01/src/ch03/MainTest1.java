package ch03;

public class MainTest1 {
	
	// 메인함수

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 대입연산자 ( = ) 
		int number = 10;
		// = (수학기호와 달리 변수나 값을 대입하는 연산자)
		// 연산에 방향은 오른쪽에서 왼쪽으로 연산이 됨
		
		int number2 = number;
		// 변수에 변수를 대입가능
		System.out.println(number);
		System.out.println(number2);
		
		System.out.println("===========");
		
		// 부호 연산자
		// 부호를 변경하는 연산자
		// 단 변수에 들어 있는 실제 값을 변경한 상태는 아님
		System.out.println(-number);
		System.out.println("number에 현재 값 : " + number);
		
		number = -number;
		
		System.out.println(number);
		// 변수에 실제 값을 변경하려면 대입 연산자를 함께 사용해야  한다.
		
		
		
		
		

	} // end of main

} // end of class
