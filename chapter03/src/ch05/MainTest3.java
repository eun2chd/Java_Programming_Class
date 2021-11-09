package ch05;

import ch04.person;

public class MainTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 다형성 : 배열(자료구조) 관계에서도 사용이 가능
		// 하나의 변수에 연관된 데이터를 통으로 관리 하기 위해 사용
		
		// 
		
		Banana banana1 = new Banana();
		Banana banana2 = new Banana();
		
		Banana[] bananaBuket = new Banana[2];
		bananaBuket[0] = banana1;
		bananaBuket[1] = banana2;
		
		
		for (Banana banana : bananaBuket) {
			
			banana.showInfo();
	
			
		}
		
		// 배열을 사용해서 담기
		// 배열은 2칸
		
		Peach peach1 = new Peach();
		Peach peach2 = new Peach();
		
		Peach[] peachBuket = new Peach[2]; 
		peachBuket[0] = peach1;
		peachBuket[1] = peach2;
		

//		for (Peach peach : peachs) {
//			
//			peachs.showinfo();
//				
//		}
		
		Fruit[] fruitBuket = new Fruit[4];
		fruitBuket[0] = banana1;
		fruitBuket[1] = peach1;
		fruitBuket[2] = banana2;
		fruitBuket[3] = peach2;
		
		for (Fruit fruit : fruitBuket) {
			fruit.showInfo();
		}
		

	}

}
