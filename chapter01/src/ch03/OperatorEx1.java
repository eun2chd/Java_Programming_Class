package ch03;

public class OperatorEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 10;
		double d = 20.5;
		double result;
		
		result =   i + d;

		// 1번문제
		System.out.println(result);
		
		// 2번문제
		System.out.println((int)result); 
		
		// 3번 문제
		--i;
		System.out.println(i);
		
		// 4번 문제
		
		System.out.println(-d);
		// 5번 문제
		
		boolean result2 = (i < d);
		
		System.out.println(result2);
		
		
		//6번문제
		int num1 = 10;
		int num2 = 30;
		boolean result3 = (num1 > 50) || (num2 > 50);
		System.out.println(result3);
		
		// 7번
		int max = (num1 > num2) ?  num1:num2;
		System.out.println(max);
		
		

	}

}
