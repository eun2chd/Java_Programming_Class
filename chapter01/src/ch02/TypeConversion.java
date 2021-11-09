package ch02;

public class TypeConversion {

	//메인 함수의 시작
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 데이터의 형 변환
		// int 자료형을 double 로 변경하거나
		// double 자료형을 int 로 변경하는 것을 말함
		
		int iNum1 = 100;
		
		System.out.println(iNum1);
		
		// 자동 형변환
		double dNum1 = iNum1;
		System.out.println(dNum1);
		
		// 강제 형변환
		double dNumber = 1.12345;
		// int = 4byte double = 8byte 
		
//		int iNumber = dNumber; 4byte 공간에 8byte 담을려고 해서 타입이 안맞다고 에러나옴
		
		// 컴파일러야 괜찮으니까 그냥 강제로 넣어
		int iNumber = (int)dNumber;
	    System.out.println(iNumber);
	    
	    
	    // 연습
	    double aValue;
	    int bValue;
	    
	    aValue = 0.5;
	    bValue = (int)10.1;
	    
	    System.out.println(bValue);
	    
	    
	    
		
		
		
		
		
		
		
	} // end of main

} //end of class
