package ch09;

public class Employee {

	public static int serialNum = 1000; // static ����
	
	private int employeeId; // �������
	private String employeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		employeeId = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}


	public static int getSerialNum() {
		
		// ���� : static �޼��� �ȿ����� ������� ���Ұ�!
		// why : ��ü�� ��������� ���� �����ؼ� ����� �� �ִ� static
		// �̱� �����Դϴ�.
		// ��ü�� �����Ǳ� ���� ����� �� �ִ� �޼���	
		
//		department = "������"; ������� ���Ұ�
		
		return serialNum;
		
		
	}
	
	
}
