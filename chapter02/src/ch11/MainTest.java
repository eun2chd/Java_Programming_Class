package ch11;

import java.util.Calendar;

public class MainTest {
	public static void main(String[] args) {

		// company 객체를 생성
//		Company compnay = new Company();  // 생성자가 private 라서 new 로 만들수 없다.
//		그럼 얻을 수 있는건 getInstance() 를 호출해서 주소를 넘겨줘야 한다.

		Company com1 = Company.getInstance();

		Company com2 = Company.getInstance();

		Company com3 = Company.getInstance();

		Company com4 = Company.getInstance();

		Company com5 = Company.getInstance();

		// 화면에 주소값을 출력


		System.out.println(com1);
		System.out.println(com2);
		System.out.println(com3);
		System.out.println(com4);
		System.out.println(com5);
		
//		Calendar c = new Calendar();  // 싱글톤 패턴이라서 이렇게 만들수는 없다
		Calendar c = Calendar.getInstance();
		
		

	}

}
