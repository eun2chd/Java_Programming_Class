package ch01;



// 하나의 작업자를 더 만들기 위해서 쓰레드는 상속한다.
class MyThreadEx2 extends Thread {
	
	String name;
	
	public MyThreadEx2(String name) {
		
		this.name = name;
		
		// TODO Auto-generated constructor stub
	} // 생성자
	
	// 쓰레드는 약속되어있다.
//	run 매서드 안에서 작업을 시켜야한다.
	@Override
	public void run() {
		int  i;
		for(i = 0; i < 50; i++) {
			
			System.out.println(name + " : " +  i  +" \t");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		} // end of for
	
	} // end of run
	
	
	
} // end of my Thread



public class ThreadTest2 {
	
	// 메인 쓰레드
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		System.out.println("메인 쓰레드 시작");
		
		MyThreadEx2 th1 = new MyThreadEx2("작업자1");
		th1.start(); // <-- 쓰레드의 작업을 시작하는 명령어 입니다.
		
//		for(int i =0; i <50; i++) {
//			
//			System.out.println("test : " + i);
//			try {
//				Thread.sleep(200);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
		MyThreadEx2 th2 = new MyThreadEx2("작업자2");
		th2.start();
		
		
		MyThreadEx2 th3 = new MyThreadEx2("작업자3");
		th3.start();
		
		
		System.out.println("메인 쓰레드 종료");
		
		
	} // end of main
	

} // end of class
