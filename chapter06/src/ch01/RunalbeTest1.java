package ch01;

import javax.swing.JFrame;

// Runnalble 인터페이스를 구현하여 만들면 된다.

class MyRunnable1 extends JFrame implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=0; i < 200; i++) {
			
			System.out.print(i+"\t");
			
		}
		
		
	}
	
	
	
}


// 자바는 하나만 상속할 수 있다. 다른 기능을 쓰고자 하면 인터페이스를 떠올리자
public class RunalbeTest1{
	
	// 메인 쓰레드
	public static void main(String[] args) {
			
			MyRunnable1 myRunnable1 = new MyRunnable1();
			
			// Runable 구현한 객체는 Thread를 생성해서 매개 변수에 담고 쓰레드를 시작한다.
			// 작업자1
			Thread thread1 = new Thread(myRunnable1);
			thread1.start();
			
			Thread thread2 = new Thread(myRunnable1);
			thread2.start();

		
		
	}

}
