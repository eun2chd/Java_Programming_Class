package ch04;

public class ClassMainTest2 {

	public static void main(String[] args) {
		
		
		ClassTest1 ShowClass = new ClassTest1();
		
		ShowClass.Classuser_Number = "3-1";
		ShowClass.ClassuserName = "����";
		ShowClass.ClassuserSchoolName = "�泲��������б�";
		ShowClass.ClassuserNumber = 15;
		ShowClass.ClassuserScore = 90;
		
		ShowClass.showClassT();
		
		System.out.println(ShowClass.add(11));
		
		
		
	}
}
