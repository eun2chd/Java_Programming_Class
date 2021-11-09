package ch10;

public class MainTest1 {
	
	public static void main(String[] args) {
		
		Zealot zealot = new Zealot("질럿1");
		
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		
		Zergling zergling= new Zergling("저글링1");
		
		
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
		System.out.println("가나다");
		System.out.println(1);
		System.out.println(0.5);
		System.out.println('A');
		
	
		
	
		
		
	} // end of main

} // end of class
