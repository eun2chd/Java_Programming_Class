package ch04;

public class ClassMainTest2 {

	public static void main(String[] args) {
		
		
		ClassTest1 ShowClass = new ClassTest1();
		
		ShowClass.Classuser_Number = "3-1";
		ShowClass.ClassuserName = "물병";
		ShowClass.ClassuserSchoolName = "경남거제고등학교";
		ShowClass.ClassuserNumber = 15;
		ShowClass.ClassuserScore = 90;
		
		ShowClass.showClassT();
		
		System.out.println(ShowClass.add(11));
		
		
		
	}
}
