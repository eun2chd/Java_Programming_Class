package ch03;

// 클래스를 사용하는 입장 쪽 코딩
public class StudentMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student();
		studentLee.studentName = "이순신";
		studentLee.address = "인천";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
	    studentLee.cleanUP();
		
		Student studentKim = new Student();
		
		System.out.println("----------------------");
		
	   studentKim.studentName = "김유신";
	   studentKim.address = "서울";
	   studentKim.showStudentInfo();
	   studentKim.takeTest();
	   studentKim.cleanUP();
	   
	   
	   System.out.println("-----------------------");
	   
	   String name1 = studentKim.getStudentName();
	   System.out.println("name1 : " + name1);
	   String name2 = studentLee.getStudentName();
	   System.out.println("name2 : " + name2);
		
	   System.out.println("-----------------------");
	   
	   
	   
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} // end of main

} // end of class
