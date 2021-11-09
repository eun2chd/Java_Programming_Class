package ch01;
 
public class StudentMainTest2 {
		
	// main 시작
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student student1 = new Student();
		
		
		System.out.println("---------------");
		
		
		Student student2 = new Student();
		
		
		student1.height = 170;
		student1.weight = 50;
		student1.grade = 3;
		student1.name = "짱구";
		
		student2.name = "둘리";
		student2.height = 185;
		student2.weight = 75;
		student2.grade = 1;
		
		System.out.println(student1.name);
		System.out.println(student1.height);
		System.out.println(student1.weight);
		System.out.println(student1.grade);
		System.out.println("---------------");
		System.out.println(student2.name);
		System.out.println(student2.height);
		System.out.println(student2.weight);
		System.out.println(student2.grade);
		
		
		

		
	} // end of main

} // end of class
