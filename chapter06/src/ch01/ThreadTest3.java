package ch01;

class Mythread3 extends Thread {
	
	
	@Override
	public void run() {
			
		for (int i = 0; i < 20; i++) {
				System.out.println(i + " : "  + Thread.currentThread());
		}
		
	}
	
	
}




public class ThreadTest3 {

	// ���� ������
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		
		Mythread3 th1 = new Mythread3();
		Mythread3 th2 = new Mythread3();
		Mythread3 th3 = new Mythread3();
		
		// �۾��� 3�� ����
		
	
		th1.start();
		th2.start();
		th3.start();
		// th3.run(); �̰͵� ����
		
		

	} // end of main

} // end of class
