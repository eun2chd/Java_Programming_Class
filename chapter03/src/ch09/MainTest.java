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
		// 다형성 - 배 (신체,선박,과일) 다양한 형태로 바라봄

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

		// instanceOf 연산자 사용해보기

		System.out.println("---------------------");

		for (int i = 0; i < remote.length; i++) {

			if (remote[i] instanceof ToyRobot) {
				System.out.println("장난감 객체 입니다.");
				// 다운캐스팅
				String name = ((ToyRobot) remote[i]).name;
				System.out.println(name);

			}

		}

		for (int i = 0; i < remote.length; i++) {

			if (remote[i] instanceof Televison) {
				System.out.println("텔레비전 객체 입니다.");
			}

		}

		for (int i = 0; i < remote.length; i++) {

			if (remote[i] instanceof Refrigerator) {
				System.out.println("냉장고 객체 입니다.");
			}

		}
		
		
		// 인터페이스 장점
		// 표준화 가능
		// 서로 관계없는 클래스들에게 관계를 맺어줌
		// 클래스간에 결합도를 낮춰서 유연한 코드를 설계가능
		
		
		//정리
		// 객체지향 패러다임 핵심
		// 객체와 객체간에 상호 협력해서 코드를 설게해 나간다.(버스,지럿) 참조변수로 전달 상호작용
		// 객체와 객체간에 관계를 정의하여 코드를 설계해 나간다.
		// (상속,포함관계,추상클래스,인터페이스) 다형성 (클래스를 다양한 형태로 바라보는 것)
		
		
		
		
		

	} // end of main

} // end of class
