package ch03;

public class MainTest3 {
	
	// main
	public static void main(String[] args) {
	
		// 증감, 감소 연산자
		// ++, --
		
		int num1 = 1;
		num1++;
		System.out.println(num1);
		int num2 = 1;
		num2--;
		System.out.println(num2);
		
		
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
//		num4 = num3++; // 대입 먼저 진행하고 그뒤에 1을 증가 시킴 [후위연산자] 대입먼저 후 ; 다음에 1을 증가
		num4 = ++num3; // 증가 먼저 하고 대입 시킴 [전치연산자] 변수에 먼저 접근해서 1증가
 		
		System.out.println(num4);
		System.out.println(num3);
		
		int num5 = 100;
		int num6;
		
		// 1. num5를 num6 변수에 담기
		// 증감 연산자를 사용해서 num6 변수를 101 로 만들어서 출력
		
		// 2. num5를 num6 변수에 담기
		// 단 증감 연산자를 사용해서 num6 변수를 101 로 만들어서 출력
		
		num6 = ++num5;
		System.out.println(num6);
		
		num6 = num5++;
		System.out.println(num6);
		System.out.println(num5);
		
		
		// 결론 : 증감연산자는 변수(공간) 에 있는 값을 1 증가 시킨다.
		// 단 : 앞에 있을때와 뒤에 있을때 연산에 순서가 다르다.
		
		
		
		
		
	} // end of main
	
	
}// end of class
