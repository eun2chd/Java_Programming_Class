package ex2;

public class test {
	
	String subjectName;
	int score;
	int subjectId;
	
public static void main(String[] args) {
		
		Student stu = new Student(1, "Lee");
		
		stu.setKoeraSubject("����", 80);
		stu.setMathSubject("����", 70);
		stu.setTotal();
		
	}
	

}

	
	

