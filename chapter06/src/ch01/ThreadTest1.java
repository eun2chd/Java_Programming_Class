package ch01;

public class ThreadTest1 {
	
	
	
	// �����Լ� <-- ���� ������
	public static void main(String[] args) {
		
		for (int i = 0; i < 30; i++) {
			
			System.out.print("-");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 1000/1�� 1000 = 1��
		} // end of for
	
	
		
		
		
	} // end of main

} // end of class
