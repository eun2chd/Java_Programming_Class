package ch03;

// Ŭ���� ����
public class Student {
	
	// �������
	public int studentID;
	public String studentName;
	public String address;
	
	// �޼��� (��� ������ �̿��ؼ� ��ü�� ����� ����� ����.)
	
	public void showStudentInfo() {
		
		System.out.println(studentName +  "," + address);
		
	}
	
	
	public String getStudentName() {
		
		return studentName;
		
	}
	
	
	// �޼����
	// ��ü�� ����� �����ϱ� ���� Ŭ���� ���ο� �����Ǵ� �Լ�
//	��� �Լ�(member function) �̶�� ��
	// �޼��� ���������ν� ��ü�� ����� ������
	
	// 1. ������ ģ��.

	public void takeTest() {
		
		System.out.println(studentName + " �л��� ������ ģ��.");
		
		
	}
	
	// 2. û�Ҹ� �Ѵ�.
	
	public void cleanUP() {
		System.out.println(studentName +" �л��� û�Ҹ� �Ѵ�.");
	}
	
	
}
