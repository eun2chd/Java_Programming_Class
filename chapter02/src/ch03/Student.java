package ch03;

// 클래스 설계
public class Student {
	
	// 멤버변수
	public int studentID;
	public String studentName;
	public String address;
	
	// 메서드 (멤버 변수를 이용해서 객체에 기능을 만들어 낸다.)
	
	public void showStudentInfo() {
		
		System.out.println(studentName +  "," + address);
		
	}
	
	
	public String getStudentName() {
		
		return studentName;
		
	}
	
	
	// 메서드란
	// 객체에 기능을 구현하기 위해 클래스 내부에 구현되는 함수
//	멤버 함수(member function) 이라고 함
	// 메서드 구현함으로써 객체의 기능이 구현됨
	
	// 1. 시험을 친다.

	public void takeTest() {
		
		System.out.println(studentName + " 학생이 시험을 친다.");
		
		
	}
	
	// 2. 청소를 한다.
	
	public void cleanUP() {
		System.out.println(studentName +" 학생이 청소를 한다.");
	}
	
	
}
