package ch10;

public class GateWayMainTest {

	public static void main(String[] args) {

		Hatchery hatchery1 = new Hatchery(1);
		Hatchery hatchery2 = new Hatchery(1);
		Hatchery hatchery3 = new Hatchery(1);

		Gateway gateway1 = new Gateway(1);
		Gateway gateway2 = new Gateway(1);
		Gateway gateway3 = new Gateway(1);

		Zealot zealot1 = gateway1.cerateZealot();
		Zealot zealot2 = gateway1.cerateZealot();
	

		gateway2.cerateZealot();
		gateway2.cerateZealot();
		gateway2.cerateZealot();
		gateway2.cerateZealot();

		gateway3.cerateZealot();
		gateway3.cerateZealot();
		gateway3.cerateZealot();
		gateway3.cerateZealot();

		zealot1.showInfo();
		
		Zergling zergling1 = hatchery1.creatZergling();
		Zergling zergling2 = hatchery1.creatZergling();
		
		hatchery1.creatZergling();
		hatchery1.creatZergling();
		hatchery1.creatZergling();
		hatchery1.creatZergling();
		hatchery1.creatZergling();
		hatchery1.creatZergling();
		hatchery1.creatZergling();

		zergling1.showInfo();
		
		
		

		// static 변수는 인스턴스들이 공유할 수 있는 변수
		// --> 객체를 생성하지 않고도 클래스 이름으로 접근이 가능하다.
		// ex) 태양 (객체가 생성되기전에 메모리에 올라가 있다)

		System.out.println("현재 생성된 질럿 수" + Gateway.zealotCount); // 클래스 이름으로 접근
		System.out.println("현재 생성된 저글링 수"+ Hatchery.zerglingcount);

	}

}
