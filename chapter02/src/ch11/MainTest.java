package ch11;

import java.util.Calendar;

public class MainTest {
	public static void main(String[] args) {

		// company ��ü�� ����
//		Company compnay = new Company();  // �����ڰ� private �� new �� ����� ����.
//		�׷� ���� �� �ִ°� getInstance() �� ȣ���ؼ� �ּҸ� �Ѱ���� �Ѵ�.

		Company com1 = Company.getInstance();

		Company com2 = Company.getInstance();

		Company com3 = Company.getInstance();

		Company com4 = Company.getInstance();

		Company com5 = Company.getInstance();

		// ȭ�鿡 �ּҰ��� ���


		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		System.out.println(com4);
		System.out.println(com5);
		
//		Calendar c = new Calendar();  // �̱��� �����̶� �̷��� ������� ����
		Calendar c = Calendar.getInstance();
		
		

	}

}
