package ch03;


class Cal {
	
	public int sum(int n1, int n2) {
		
		return n1 + n2;
		
		
	}
	
	public int multiply(int n1, int n2) {
		
		return n1 * n2;
		
	}
	
}


class Cal2 extends Cal {
	
	public int minus(int n1, int n2) {
		
		return n1 - n2;
		
	}
	
	// 오버라이드 (부모에 있는 메서드를 필요에 의해서 재정의 해서 사용하는 개념)
	
//	public int multiply(int n1, int n2) {
//		if(n1 == 0 || n2 == 0) {
//			System.out.println("0을 입력하지 마세요");
//		}
//		
//		return n1 * n2;
//		
//	}
	
	
	@Override  // @override 부모한테서 물려받았구나, 자식에서 재정의 가능
	public int multiply(int n1, int n2) {
	
		if(n1 == 0 || n2 ==0) {
			System.out.println("0을 입력하지 마세요");
		}
		
		return super.multiply(n1, n2);
		        // super 은 부모를 호출해줌 .연산자를 이용해서 부모 multiply 호출
		}
	
	
}



public class MainTest2 {

	public static void main(String[] args) {
		
		Cal2 cal2 = new Cal2();
		System.out.println(cal2.sum(5, 3));
		System.out.println(cal2.minus(10, 7));
		System.out.println(cal2.multiply(10, 0));
		
	}
}
