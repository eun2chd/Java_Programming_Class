package ch04;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity1 activity1 = new Activity1("����ȭ��");
		Activity2 activity2 = new Activity2("����ȭ��");
		
		activity2.setCallbackCheckPositon(activity1.callbackCheckPositon);
		
		

	}

}
