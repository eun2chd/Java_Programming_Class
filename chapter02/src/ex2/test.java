package ex2;

public class test {
	
	String subjectName;
	int score;
	int subjectId;
	
public static void main(String[] args) {
		
		Student stu = new Student(1, "Lee");
		
		stu.setKoeraSubject("국어", 80);
		stu.setMathSubject("수학", 70);
		stu.setTotal();
		
	}
	

}

	
	

