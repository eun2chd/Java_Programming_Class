package ch03;

public class MainTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 관계 연산자
		// 관찰에 결과가 참, 거짓인지 판별할때 사용한다.
		// 결과값은 오직 true , false 이다.
		
		int num1 = 5;
		int num2 = 3;
		
		boolean value1 = (num1 < num2);  // 오른쪽이 크냐? : 거짓
		System.out.println(value1);
		
		
		boolean value2 = (num1 > num2); // 왼쪽이 크냐 ?  : 참
		System.out.println(value2);
		
		boolean value3 = (num1 == num2); // 서로 같냐? : 거짓
		System.out.println(value3);
		
		boolean value4 = (num1 != num2); // 서로 다르냐? : 참
		System.out.println(value4);
		
		
		
		
		

	}

}
