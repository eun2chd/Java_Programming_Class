package ch05;

public class WhileMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 1;
		int sum = 0;
	
		
		while(num <= 10) {
			
			System.out.println("현재 값 : " + num);
			sum += num;
			num++;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
			System.out.println("연산의 결과값은 : " + sum + " 입니다. ");
		
		
		
		
		
		
		

	} // end of main

} // end of class
