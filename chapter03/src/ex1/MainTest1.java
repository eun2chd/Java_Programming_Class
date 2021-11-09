package ex1;

import java.util.Scanner;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿");		
		Marine marine1 = new Marine("마린");
		Zergling zerling1 = new Zergling("저글링");
		
		
		
		System.out.println("---유닛 선택---");
		System.out.println("1. 질럿 2. 마린 3. 저글링");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		

		if(input == 1)
		{
			zealot1.showInfo();
			System.out.println("---공격 대상 선택---");
			System.out.println("1.마린 2. 질럿 3. 저글링");
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
			System.out.println("---공격 대상 선택---");
			System.out.println("1.마린 2. 질럿 3. 저글링");
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
			System.out.println("---공격 대상 선택---");
			System.out.println("1.마린 2. 질럿 3. 저글링");
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
