package ch02;import java.nio.channels.AcceptPendingException;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 함수 사용하는 방법 (모양 맞추기)
		int num1 = 10;
		int num2 = 20;
		
		double total = addNum(42.123, 10.5);
		System.out.println("total : " + total);
		
		sayHello("반갑습니다.");
		
		int sum = calcSum();
		System.out.println("sum : " + sum);
		
		System.out.println("---------------");
		
		int result1 = intAdd(5, 6, 7);
		System.out.println("num 의 합계 : "  + result1);
		
		double result2 = doubleAdd(10.5, 20.5);
		System.out.println("su 의 합계 : " +  result2);
		
		printArticle("기사제목 : 날씨좋음");
		
		
		
		
	
	} // end of main
	
	// 1. 반환 값이 없는 함수 설계하기
	public static void sayHello(String greeting) {
		
		System.out.println(greeting);
		
		
	}
	// 2. 매개  변수가 없는 함수 만들기 - > 반환값 있음
	
	public static int calcSum() {
			int sum = 0;
			int i;
			
			for(i=0; i < 101;i++)
			{
				sum += i;
				
			}
			
			return sum;
			
	}
	
	
    // 3. 반환값이 있고 매개변수를 받는 함수 만들기
	public static double addNum(double n1, double n2) {
				
			double result = 0.0;
            result = n1 + n2;			
			return result;
			
		
		
	}
	
	
	// 1.
	
	public static int intAdd(int n1,int n2,int n3) {
					
		     return n1 + n2 + n3;
		     
		}
	
	
	public static double doubleAdd(double d1,  double d2) {
		
			double sum = d1 + d2;
			return sum;
		
	}
	
	
	public static void printArticle(String article) {
		
		System.out.println(article);
	}
	
	
	
	
	// 함수를 만들어 봅시다.
	
	// 1. 리턴값 int , 매개변수가 n1,n2,n3 함수이름 : intAdd
	
	// 2.리턴값 double 매개변수 d1, d2 이름은 -> dobleAdd
	
	// 3. 리턴값 없음, 매개 변수 String article -- > 함수의 이름 : printArticle
	
	
	
	

	
	
	
} // end of class
