package ch05;

public class ForMainTest3 {

	// main ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 ���� 9 ���� �ݺ�
		
		int num = 0;
	
		for(int i = 2; i <= 9; i++) {   // one for start
			for(int j = 1; j <= 9; j++ ) {  // two for start
	            
				 num = i * j;
			     
				 System.out.println(i + " * " + j + " = " + num);
				
				
			} //two end for
			
			System.out.println();
		
			
		} // one end for
		
		
		
		
		
	

	} // end of main

}  // end of class
