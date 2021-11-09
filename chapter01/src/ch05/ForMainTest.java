package ch05;

public class ForMainTest {

	
	// main 시작
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *   for(초기화 식; 조건식; 증감식) {
		 *      
		 *       수행문;
		 *       
		 *       		        
		 *   
		 *   }
		 * 
		 * 
		 * 
		 * 
		 * */
		
		// for문을 이용해서 1부터 10까지 덧셈연산 진행
		
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i<=10;i++)
		{
//			sum = sum + i; 
			sum += i;
			System.out.println("i의 현재값 : " + i);
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		/* 구구단
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<10;j++)
			{
				num = i*j;
				System.out.println(i + " * " + j + " = " + num);
			}
			System.out.println();
		}
		*/
		
		
		
		
		
		
 	} // end of main

} // end of class
