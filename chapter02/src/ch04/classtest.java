package ch04;

public class classtest {
						
	public int studentId;
	public String StudentName;
	public String address;
	
	
	public void showStudentInfo() {
		
		System.out.println(studentId + " , "+ address);
		
	}
	 
	
	public String getStudentNmae()
	{
		return StudentName;
	}
	
	public static int showID(int su)
	{
		int sum = 0;
		
		do {
			
			sum += su;
			su--;
		
		}while(su != 0);
		
		return sum;
		
		
	}
	
	

	
	
	

} // and of class

