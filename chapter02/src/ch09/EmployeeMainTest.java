package ch09;

public class EmployeeMainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ν��Ͻ� �̸��� �ֿ��ؼ� ����

		int temp = Employee.getSerialNum();
		System.out.println(temp);
//		Employee test1 = new Employee();
//		test1.getEmployeeId();
		int temp1 = Employee.getSerialNum();
		int tmep2 = Employee.getSerialNum();
		int tmep3 = Employee.getSerialNum();
		int tmep4 = Employee.getSerialNum();
								
//		
		
		
		Employee employee1 = new Employee();
	
		
		
		
		System.out.println(employee1.serialNum);
		System.out.println(employee1.getEmployeeId());
		
	    Employee employee2 = new Employee();
	    Employee employee3 = new Employee();
	    Employee employee4 = new Employee();
	    Employee employee5 = new Employee();
	    
		System.out.println(employee5.getEmployeeId());
	    System.out.println(employee1.serialNum);
	    System.out.println(employee2.serialNum);
	    System.out.println(employee3.serialNum);
	    
	    //static ����, ��� ���� , ���� ����  --> �޸� ��ġ Ȯ��
	    
	    // Ŭ���� �̸����� �����ؼ� ȣ��
	    int s1 = employee1.getSerialNum();
		int s2 = employee2.getSerialNum();
		int s3 = employee3.getSerialNum();
		int s4 = employee4.getSerialNum();
		int s5 = employee5.getSerialNum();
		
		System.out.println();
		System.out.println("----------");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		

		
	    
		
		
	    
	    
	    
	} // end of main

} // end of class
