package ch04;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activity1 activity1 = new Activity1("메인화면");
		Activity2 activity2 = new Activity2("서브화면");
		
		activity2.setCallbackCheckPositon(activity1.callbackCheckPositon);
		
		

	}

}
