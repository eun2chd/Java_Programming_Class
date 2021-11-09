package ch03;

public class ExceptionEx1 {

	public static void main(String[] args) {
	
		// 예외발생
		
		int[] arr = {1,2,3,4,5};
//		for (int i = 0; i < 10; i++) {
//			System.out.println(arr[i]);
//	
//		}
		
		try {
			
			// 예외가 발생할 코드를 try문에 작성을 한다.
			for (int j = 0; j < 10; j++) {
				System.out.println(arr[j]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("예외가 발생함");
				
			}
			
	
			
		System.out.println("비정상 종료되지 않았습니다.");
		
		// 프로그래밍이 종료 되지 않고 계속 실행되어진다.
		
		
	} // end of main

}
// end of class
