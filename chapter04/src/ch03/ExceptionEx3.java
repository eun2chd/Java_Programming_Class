package ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

class MyException {
	
	String fileName;
	
	public MyException(String fileNmae) {

		this.fileName = fileNmae;
	
	}
	
	// throws 란?
	public String readFile() throws IOException {
		
		FileInputStream fls = new FileInputStream(fileName);
		Properties prop = new Properties();
		prop.load(fls);
		String dbType = prop.getProperty("DBTYPE");
	
		return dbType;
	}
	
	
}

public class ExceptionEx3 {
	public static void main(String[] args) {
		
		Scanner scanner = null;
		
		MyException exception = new MyException("a.txt");
		
		try {
			
			scanner = new Scanner(System.in);
			int userInput = scanner.nextInt();
			
		
		} catch (Exception e) {
			System.out.println("예외 발생");
		}finally {
			scanner.close();
		}
	
	
		
		
	}

}
