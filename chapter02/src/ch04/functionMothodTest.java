package ch04;

import java.util.Random;
import java.util.Scanner;

public class functionMothodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		print();
		three();

	}

	public static void star(int num) {

		int star = num;

		for (int i = 0; i < star; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("��");
			}
			System.out.println();
		}

	}

	public static void three() {

		Random rand = new Random();
		int randword;
		int count = 5;
		String a = "����";
		String b = "����";
		String c = "��";
		
		Scanner sc = new Scanner(System.in);
		

		/*randword = rand.nextInt(3);*/
			randword = 1;

		while (count != 0) {
			System.out.println();
			System.out.println();
			
			System.out.println("----- ���ڸ� ������ ------");
			System.out.println("        ���� Ƚ�� : " + count) ;
			System.out.println("���� [ 0 ] ���� [ 1 ] �� [ 2 ] ");
			int input = sc.nextInt();
			
			if(input == 0)
			{
				if(randword == 2)
				{
					System.out.println("�̰���ϴ�.");
					System.out.println("����� : " + a);
					System.out.println("��ǻ�� : " + c);
					break;
				}
				else if(input == 0 && randword == 0)
				{
					System.out.println("�����ϴ�.");
					System.out.println("����� : " + a);
					System.out.println("��ǻ�� :"  + a);
					count--;
					System.out.println("���� ��ȸ : " + count);
				}
				else if(randword == 1)
				{
					System.out.println("LOSE.");
					System.out.println("����� : " + a);
					System.out.println("��ǻ�� : " + b);
					count--;
					System.out.println("���� ��ȸ : " + count);
					
				}
				
			}
			
			
			
		
		}

	}

	public static void print() {

		System.out.println("���������� ������ �����ϰڽ��ϴ�.");
		System.out.println("�� ������ 5�� ����˴ϴ�.");
		System.out.println("�¸��ϸ� ���α׷��� ����˴ϴ�..");
	}

}
