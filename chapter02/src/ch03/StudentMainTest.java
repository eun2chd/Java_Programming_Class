package ch03;

// Ŭ������ ����ϴ� ���� �� �ڵ�
public class StudentMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student studentLee = new Student();
		studentLee.studentName = "�̼���";
		studentLee.address = "��õ";
		
		studentLee.showStudentInfo();
		studentLee.takeTest();
	    studentLee.cleanUP();
		
		Student studentKim = new Student();
		
		System.out.println("----------------------");
		
	   studentKim.studentName = "������";
	   studentKim.address = "����";
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
