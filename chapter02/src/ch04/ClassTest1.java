package ch04;

public class ClassTest1 {
	//�б� , ��, ��ȣ , 
	
	int ClassuserScore;
	String ClassuserName;
	int ClassuserNumber; // �ݹ�ȣ
	String Classuser_Number;  // ���?
	String ClassuserSchoolName;
	
	
	
	
 public void showClassT(){
	 
	    System.out.println("���� ������ ��Ÿ���ϴ�.");
	    System.out.println("�� : " + Classuser_Number);
	    System.out.println("�� ��ȣ�� : " + ClassuserNumber);
	    System.out.println("�� �̸��� : " + ClassuserName);
	    System.out.println("�츮 �б��� : " + ClassuserSchoolName);
	    System.out.println("�� ������ : " + ClassuserScore);
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
