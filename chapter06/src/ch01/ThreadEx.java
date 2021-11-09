package ch01;

import java.util.Scanner;

class MyThread1 extends Thread {

	boolean flag = true;

	@Override
	public void run() {

		while (flag) {

			System.out.print("-");
			System.out.println(flag);

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	} // end of run

} // end of class

public class ThreadEx {

	public static void main(String[] args) {

		System.out.println("작업자를 생성 하겠습니다.");
		MyThread1 thread1 = new MyThread1();
		thread1.start();

		Scanner sc = new Scanner(System.in);

		System.out.println("0번을 입력하면 중지 합니다.");
		do {

			int userInput = sc.nextInt();

			if (userInput == 0) {
//			thread1.stop(); //  deprecated ( 더이상 유지보수 하지 않음) - 버전이 올라가면 올라갈수록 더이상 안쓸가능성이 높음
//			thread1.flag = false;
				thread1.flag = false;
			}
			
		} while (thread1.flag != false);
		
		

	} // end of main
} // end of class
