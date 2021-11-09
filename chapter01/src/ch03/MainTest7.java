package ch03;

public class MainTest7 {

	// main
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자가 함께 사용

		int num1 = 1;
		// num1 = num1 + 10;
		System.out.println(num1);
		num1 += 10;
		System.out.println(num1);

		int num2 = 1;
		// num2 = num2 - 10;

		num2 -= 10;
		System.out.println(num2);

		num2 *= 2;
		System.out.println(num2);
		// num2 = num2 * 2;

		num2 /= 2;
		System.out.println(num2);
		// num2 = num2 / 2;

		num2 %= 2;
		System.out.println(num2);
//		num2 = num2 % 2;

	} // end of main

} // end of class
