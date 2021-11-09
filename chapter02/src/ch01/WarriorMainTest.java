package ch01;

public class WarriorMainTest {

	
	// 설계된  클래스를 사용하는 쪽 코딩
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int height; // main 안에 선언한 변수를 지역 변수
		
		
		Warrior w1 = new Warrior();
		
		w1.heigt = 200;
		w1.power = 100;
		w1.name = "전사1";
		w1.color = "초록색";
		
		
		System.out.println(w1.heigt);
		System.out.println(w1.power);
		System.out.println(w1.name);
		System.out.println(w1.color);
		
		Warrior w2 = new Warrior();
		
		w2.heigt = 100;
		w2.power = 50;
		w2.name = "작은전사1";
		w2.color = "빨간색";
				
		System.out.println(w2.heigt);
		System.out.println(w2.power);
		System.out.println(w2.name);
		System.out.println(w2.color);
				
				
				
	} // end of main

} // end of class
 