package ch10;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		Zealot zealot = new Zealot("����1");
		
		Marine marine1 = new Marine("����1");
		Marine marine2 = new Marine("����2");
		
		Zergling zergling= new Zergling("���۸�1");
		
		
//		zealot.showInfo();
//		
//		marine.showInfo();
//		
//		zergling.showInfo();
		
		zealot.attack(marine1);
		zealot.attack(zergling);
		zealot.attack(marine2);
		zealot.attack(zergling);
		zealot.attack(marine1);
		zealot.attack(zergling);
		zealot.attack(marine2);
		zealot.attack(zergling);
		zealot.attack(marine1);
		zealot.attack(zergling);
		zealot.attack(marine2);
		
		marine1.showInfo();
		marine2.showInfo();
		
		
		System.out.println();
		System.out.println("������");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
	
		
	
		
		
	} // end of main

} // end of class
