package ch04;

import java.util.Scanner;
 

 // main ���� 
public class IfMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("������ �Է����ּ���");
		
		Scanner scanner = new Scanner(System.in);
		int point = scanner.nextInt();
		
		// ���� 1. if ���� ����ؼ� ������ ������ּ���
		// ������ ������� "����� ������ + result �Դϴ�.
		
		char result = 'Z';
		
		if(point <= 100 && point >= 90) {
			result = 'A';
		}
		else if(point < 90 && point >= 80) {
			result ='B';
		}
		else if(point < 80 && point >=70) {
			result = 'C';
			
		}
		else if(point < 70 && point >= 60) {
			result = 'D';
		}
		else if(point < 60 && point >= 0) {
			result ='F';
		}
		
		if(result != 'Z') {
			System.out.println("����� ������ : " + result + "�Դϴ�.");
		}
		else {
			System.out.println("�Է��� �߸� �Ͽ����ϴ�.");
		}
		
	
  
	} // end of main
	
} // end of class
