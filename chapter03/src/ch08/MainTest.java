package ch08;

import ch01.Zergling;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marine marine = new Marine("����",100,5,1,"�跰");
		Zealot zealot = new Zealot("����",100,10,1,"����Ʈ����");
		Zerling zerling = new Zerling("���۸�",100,5,1,"��ó��");

		marine.showInfo();
		zealot.showInfo();
		zerling.showInfo();
		
		// ��ĳ���� ����
		// �θ��ڽİ��踸 ����
		// �ڽ��ν��Ͻ� ������ �θ� �ν��Ͻ� �����Ұ�
//		Marine marine = new Unit("����2",100,5,1,"�跰"); ���� �Ұ�
		Unit unit = new Marine("����2",100,5,1,"�跰");
	
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
		
		
		System.out.println("����� ���� �� : " + MarineCount);
		System.out.println("����� ���� �� : " + ZelotCount);
		System.out.println("����� ���۸� �� : " + ZelingCount);
		
		
	}

}
