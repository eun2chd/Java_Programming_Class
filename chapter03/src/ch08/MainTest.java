package ch08;

import ch01.Zergling;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marine marine = new Marine("마린",100,5,1,"배럭");
		Zealot zealot = new Zealot("질럿",100,10,1,"게이트웨이");
		Zerling zerling = new Zerling("저글링",100,5,1,"해처리");

		marine.showInfo();
		zealot.showInfo();
		zerling.showInfo();
		
		// 업캐스팅 복습
		// 부모자식관계만 가능
		// 자식인스턴스 변수에 부모 인스턴스 생성불가
//		Marine marine = new Unit("마린2",100,5,1,"배럭"); 생성 불가
		Unit unit = new Marine("마린2",100,5,1,"배럭");
	
		unit.showInfo();
		
		marine.attack(zealot);
		zealot.attack(zerling);
		zerling.attack(zealot);
		
		
		
		marine.marineCreat(marine);
		zealot.zealotCreat(zealot);
		zerling.zerlingCreat(zerling);
		
		
		int MarineCount = Unit.marineC;
		int ZelotCount = Unit.marineC;
		int ZelingCount = Unit.marineC;
		
		
		System.out.println("생산된 마린 수 : " + MarineCount);
		System.out.println("생산된 질럿 수 : " + ZelotCount);
		System.out.println("생산된 저글링 수 : " + ZelingCount);
		
		
	}

}
