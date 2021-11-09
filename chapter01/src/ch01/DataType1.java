package ch01;

public class DataType1 {

//	메인함수(코드의 시작점)
	public static void main(String[] args) {
		// 데이터 타입 종류 
		// 1. 기본 자료형(primitive data type)
		// 2. 참조 타입(Reference Type)
		
		
		// 기본 자료형
		// 정수형 문자형 실수형 논리형(4가지 존재)
		
		// 정수형 (1,10,100)
		
		
		byte b; // 1byte (8bit)
		short s; // 2byte (16bit)
		int i; // 4byte(32bit)
		long l; // 8byte(64bit)
	   
		b = 127;
		
		// b = 128;
		
		b = -128;
		
		// int 의 수의 표현 범위
		
		i = 2100000000;
		i = -2100000000;
		
		l = 2200000000L; // 접미사(대문자 L 또는 l 을 사용할 수 있다.)
								// int형으로 보지말고 long 형으로 보라고 접미사를 넣어줌
		
		i = 10;
		
		System.out.println(i);
		
		i = 300;
		System.out.println(i);
		
		
		
		
		
	} // end of main 
} // end of class
