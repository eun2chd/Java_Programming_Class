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
		
		
		

		// static ������ �ν��Ͻ����� ������ �� �ִ� ����
		// --> ��ü�� �������� �ʰ� Ŭ���� �̸����� ������ �����ϴ�.
		// ex) �¾� (��ü�� �����Ǳ����� �޸𸮿� �ö� �ִ�)

		System.out.println("���� ������ ���� ��" + Gateway.zealotCount); // Ŭ���� �̸����� ����
		System.out.println("���� ������ ���۸� ��"+ Hatchery.zerglingcount);

	}

}
