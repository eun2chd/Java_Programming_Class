package ch04;

public class functiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int addtest = add(4,5);
		System.out.println(addtest);
		double doubletest = Doubleadd(30.5,40.0);
		System.out.println(doubletest);
		printString("æ»≥Á«œººø‰...");
		int num = addword();
		System.out.println(num);
		
		
		
		
		
		

	}
	
	public static int add(int num1, int num2) {
		
		int sum = 0;
		sum = num1 + num2;
		return sum;
		
		
	}
	
	public static double Doubleadd(double a,double b) {
		
		double sum = 0;
		
		sum = a + b;
		
		return sum;
		
		
	}
	
	
	public static void printString(String arg) {
		
		System.out.println("arg");
		
	}
	
	public static int addword() {
		
		int sum = 0;
		
		for(int i = 0; i< 101; i++)
		{
			sum += i;
			
		}
		
		return sum;
		
		
	}

}
