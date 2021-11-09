package ch09;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Televison televison = new Televison();
		Refrigerator refrigerator = new Refrigerator();
		ToyRobot toyrobot = new ToyRobot();

		televison.turnOff();

		televison.turnOn();

		System.out.println("------------------");

		refrigerator.turnOn();

		refrigerator.turnOff();

		System.out.println("------------------");
		// ������ - �� (��ü,����,����) �پ��� ���·� �ٶ�

		RemoteController[] remote = new RemoteController[3];

		remote[0] = televison;
		remote[1] = refrigerator;
		remote[2] = toyrobot;

		for (RemoteController remoteController : remote) {

			remoteController.turnOn();

		}

		System.out.println("---------------------");

		for (RemoteController remoteController : remote) {

			remoteController.turnOff();
		}

		// instanceOf ������ ����غ���

		System.out.println("---------------------");

		for (int i = 0; i < remote.length; i++) {

			if (remote[i] instanceof ToyRobot) {
				System.out.println("�峭�� ��ü �Դϴ�.");
				// �ٿ�ĳ����
				String name = ((ToyRobot) remote[i]).name;
				System.out.println(name);

			}

		}

		for (int i = 0; i < remote.length; i++) {

			if (remote[i] instanceof Televison) {
				System.out.println("�ڷ����� ��ü �Դϴ�.");
			}

		}

		for (int i = 0; i < remote.length; i++) {

			if (remote[i] instanceof Refrigerator) {
				System.out.println("����� ��ü �Դϴ�.");
			}

		}
		
		
		// �������̽� ����
		// ǥ��ȭ ����
		// ���� ������� Ŭ�����鿡�� ���踦 �ξ���
		// Ŭ�������� ���յ��� ���缭 ������ �ڵ带 ���谡��
		
		
		//����
		// ��ü���� �з����� �ٽ�
		// ��ü�� ��ü���� ��ȣ �����ؼ� �ڵ带 ������ ������.(����,����) ���������� ���� ��ȣ�ۿ�
		// ��ü�� ��ü���� ���踦 �����Ͽ� �ڵ带 ������ ������.
		// (���,���԰���,�߻�Ŭ����,�������̽�) ������ (Ŭ������ �پ��� ���·� �ٶ󺸴� ��)
		
		
		
		
		

	} // end of main

} // end of class
