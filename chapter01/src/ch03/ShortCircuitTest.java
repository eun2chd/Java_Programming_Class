package ch03;

public class ShortCircuitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 5; 
		int i = 0; 
		
		boolean value = ((num1 = num1 + 10 ) < 10) && ( ( i = i + 2 ) < 10); // num = 15 < 10 = f     i =  0 <10 t  f
		System.out.println(value); // f
		System.out.println(num1);  // 15
		System.out.println(i); // 0
		
		value = ((num1 = num1 + 10 ) < 10) || ( ( i = i + 2 ) < 10);  // num1 = 15  < 10 : f  || 2 < 10 = t 
		System.out.println(value); // t
		System.out.println(num1); // 25
		System.out.println(i); // 2


	}

}
