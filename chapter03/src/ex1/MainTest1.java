package ex1;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("����");		
		Marine marine1 = new Marine("����");
		Zergling zerling1 = new Zergling("���۸�");
		
		
		
		System.out.println("---���� ����---");
		System.out.println("1. ���� 2. ���� 3. ���۸�");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		

		if(input == 1)
		{
			zealot1.showInfo();
			System.out.println("---���� ��� ����---");
			System.out.println("1.���� 2. ���� 3. ���۸�");
			int attack = sc.nextInt();
				if(attack == 1) {
					zealot1.attack(marine1);
					marine1.showInfo();
				}
				else if(attack == 2) {
					zealot1.attack(zealot1);
					zealot1.showInfo();
				}
				else if(attack == 3) {
					zealot1.attack(zerling1);
					zerling1.showInfo();
				}
		}
		
		if(input == 2)
		{
			marine1.showInfo();
			System.out.println("---���� ��� ����---");
			System.out.println("1.���� 2. ���� 3. ���۸�");
			int attack = sc.nextInt();
				if(attack == 1) {
					marine1.attack(marine1);
					marine1.showInfo();
				}
				else if(attack == 2) {
					marine1.attack(zealot1);
					zealot1.showInfo();
				}
				else if(attack == 3) {
					marine1.attack(zerling1);
					zerling1.showInfo();
				}
			
			
		}
		
		if(input == 3)
		{
			zerling1.showInfo();
			System.out.println("---���� ��� ����---");
			System.out.println("1.���� 2. ���� 3. ���۸�");
			int attack = sc.nextInt();
				if(attack == 1) {
					zerling1.attack(marine1);
					marine1.showInfo();
				}
				else if(attack == 2) {
					zerling1.attack(zealot1);
					zealot1.showInfo();
				}
				else if(attack == 3) {
					zerling1.attack(zerling1);
					zerling1.showInfo();
				}
		}
	
		
		
		
		
	
	} // end of main

}  // end of class
