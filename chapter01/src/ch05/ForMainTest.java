package ch05;

public class ForMainTest {

	
	// main ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *   for(�ʱ�ȭ ��; ���ǽ�; ������) {
		 *      
		 *       ���๮;
		 *       
		 *       		        
		 *   
		 *   }
		 * 
		 * 
		 * 
		 * 
		 * */
		
		// for���� �̿��ؼ� 1���� 10���� �������� ����
		
		int num = 0;
		int sum = 0;
		
		for(int i = 1; i<=10;i++)
		{
//			sum = sum + i; 
			sum += i;
			System.out.println("i�� ���簪 : " + i);
			
		}
		
		System.out.println(sum);
		
		
		
		
		
		
		
		
		/* ������
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
