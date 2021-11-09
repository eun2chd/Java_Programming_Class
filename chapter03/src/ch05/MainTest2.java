package ch05;

import java.util.Scanner;

public class MainTest2 {
	
	public static void main(String[] args) {
		
	
	
		final int BANANA =1;
		final int PEACH = 2;
		
		// 스캐너
		// 사용자가 입력한 1,2  받으면 해당하는 객체에 정보를
		// 화면에 출력
		
		System.out.println("바나나 : 1 , 복숭아 : 2");
		
	
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Fruit fruit;
		
		
		if(num == BANANA) {
			
			fruit = new Banana(); // 업 캐스팅
		
			
		}
		else
		{
	
			fruit = new Peach();
		
		}
		
		fruit.showInfo();
		
		// 사용자가 입력한 값에 따라서 인스턴스를 쉽게 
		// 바꿔 줄수 있다.
		
		// 만약 1번이라면 바나나 객체를 생성
		// showinfo 매서드 호출
		
		
		// TODO Auto-generated constructor stub
	}

}
