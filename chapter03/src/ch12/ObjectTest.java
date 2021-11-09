package ch12;

class Student extends Object{
	
	@Override
	public String toString() {
		return "학생클래스";
	
}


public class ObjectTest extends Object{
	
	String str1;

	}

	
//	자바에서 최상위 클래스는 Object 이다.
	
	
	
	public static void main(String[] args) {

		 Student s1= new Student();
		 System.out.println(s1);
		 
		 String str1 = new String("안녕하세요");
		 System.out.println(str1);
		
		
	} // end of main

}
