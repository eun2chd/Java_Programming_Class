package ch11;

public class Company {

	// 1. ������ private �� �����.
	
	
	private Company () {
		
	
	}
	
	
	// 2. static ������ Ȱ���ؼ� ���ο��� ��ü�� �����Ѵ�.
	private static Company instance = new Company();
	
	
	// 3. �ܺξּ� ������ �ν��Ͻ��� ������ �� �ִ� public �޼��带 �����ؾ� �Ѵ�.
	
	public static Company getInstance() {
		// ����� ��
		
		return instance;
		
		
		
	}
	
	
	

}
