package ch01;

import javax.swing.JFrame;

// Runnalble �������̽��� �����Ͽ� ����� �ȴ�.

class MyRunnable1 extends JFrame implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i < 200; i++) {
			
			System.out.print(i+"\t");
			
		}
		
		
	}
	
	
	
}


// �ڹٴ� �ϳ��� ����� �� �ִ�. �ٸ� ����� ������ �ϸ� �������̽��� ���ø���
public class RunalbeTest1{
	
	// ���� ������
	public static void main(String[] args) {
			
			MyRunnable1 myRunnable1 = new MyRunnable1();
			
			// Runable ������ ��ü�� Thread�� �����ؼ� �Ű� ������ ��� �����带 �����Ѵ�.
			// �۾���1
			Thread thread1 = new Thread(myRunnable1);
			thread1.start();
			
			Thread thread2 = new Thread(myRunnable1);
			thread2.start();

		
		
	}

}
