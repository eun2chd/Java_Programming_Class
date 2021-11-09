package ex2;

public class Student {
	
	int studentId;
	String studentName;
	
	test Korea;
	test math;

	
	public Student(int id, String name) {
		
		studentId = id;
		studentName = name;
		
		Korea = new test();
		math = new test();
		
		
	}
	
	public void setKoeraSubject(String name, int score) {
		
		Korea.subjectName = name;
		Korea.score = score;
		
	
		
	}
	
	public void setMathSubject(String name, int score) {
		
		math.score = score;
		math.subjectName = name;
		
	}
	
	public void setTotal() {
		
		int total = Korea.score + math.score;
		System.out.println("학생의 총점은" + total + "입니다.");
		
	}

}
