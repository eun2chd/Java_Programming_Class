package ch03;

public class MainTest5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 논리 연산자  (&& , ||) 엠퍼센트, 버티컬 바
		// 관계 연산자와 혼합하여 많이 사용 됨
		// 연산의 결과가 true, false
		
		int num1 = 10;
		int num2 = 20;
		// 1. 논리곱 &&
		// 
		
		// 참은 =1 , 거짓 = 0
		
		boolean flag1 = (num1 > 0) && (num2 > 0); // 1 && 1 = 1
		
		boolean flag2 = (num1 > 0) && (num2 < 0); // 1 && 0 = 0
		
		// 2. 논리 합 (||)
		
		boolean flag3 = (num1 < 0) || (num2 > 0); // 0 || 1 = 1
		boolean flag4 = (num1 > 0) || (num2 > 0); // 1 || 1 = 1
		
		System.out.println(flag4);
		System.out.println("====================");
		
		// num1 = 10
		boolean flag5 = (num1 < 0) && (num2 > 0); 
		
		boolean flag6 = (num1 > 0) || (num2 > 0); 
		
		
		
		
		
		
		
		
		

	}

}
