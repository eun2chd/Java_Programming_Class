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

		System.out.println("�۾��ڸ� ���� �ϰڽ��ϴ�.");
		MyThread1 thread1 = new MyThread1();
		thread1.start();

		Scanner sc = new Scanner(System.in);

		System.out.println("0���� �Է��ϸ� ���� �մϴ�.");
		do {

			int userInput = sc.nextInt();

			if (userInput == 0) {
//			thread1.stop(); //  deprecated ( ���̻� �������� ���� ����) - ������ �ö󰡸� �ö󰥼��� ���̻� �Ⱦ����ɼ��� ����
//			thread1.flag = false;
				thread1.flag = false;
			}
			
		} while (thread1.flag != false);
		
		

	} // end of main
} // end of class
