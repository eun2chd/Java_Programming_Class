package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 0;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
	
		
		
		((CompleteCalc)calc).showinfo();
//		calc.showInfo();
		
		

	}

}
