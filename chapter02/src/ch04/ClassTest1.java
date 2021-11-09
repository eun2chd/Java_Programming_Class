package ch04;

public class ClassTest1 {
	//학교 , 반, 번호 , 
	
	int ClassuserScore;
	String ClassuserName;
	int ClassuserNumber; // 반번호
	String Classuser_Number;  // 몇반?
	String ClassuserSchoolName;
	
	
	
	
 public void showClassT(){
	 
	    System.out.println("나의 정보를 나타냅니다.");
	    System.out.println("반 : " + Classuser_Number);
	    System.out.println("내 번호는 : " + ClassuserNumber);
	    System.out.println("내 이름은 : " + ClassuserName);
	    System.out.println("우리 학교는 : " + ClassuserSchoolName);
	    System.out.println("내 점수는 : " + ClassuserScore);
 }
 
 
 public static int add(int num)
 {
	int sum = 0;
	
	for(int i = 0; i < num; i++)
	{
		sum += i;
		
	}
	
	return sum;
	
	 
 }
	
	

}
