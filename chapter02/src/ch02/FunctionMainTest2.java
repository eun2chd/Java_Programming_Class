package ch02;import java.nio.channels.AcceptPendingException;

public class FunctionMainTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �Լ� ����ϴ� ��� (��� ���߱�)
		int num1 = 10;
		int num2 = 20;
		
		double total = addNum(42.123, 10.5);
		System.out.println("total : " + total);
		
		sayHello("�ݰ����ϴ�.");
		
		int sum = calcSum();
		System.out.println("sum : " + sum);
		
		System.out.println("---------------");
		
		int result1 = intAdd(5, 6, 7);
		System.out.println("num �� �հ� : "  + result1);
		
		double result2 = doubleAdd(10.5, 20.5);
		System.out.println("su �� �հ� : " +  result2);
		
		printArticle("������� : ��������");
		
		
		
		
	
	} // end of main
	
	// 1. ��ȯ ���� ���� �Լ� �����ϱ�
	public static void sayHello(String greeting) {
		
		System.out.println(greeting);
		
		
	}
	// 2. �Ű�  ������ ���� �Լ� ����� - > ��ȯ�� ����
	
	public static int calcSum() {
			int sum = 0;
			int i;
			
			for(i=0; i < 101;i++)
			{
				sum += i;
				
			}
			
			return sum;
			
	}
	
	
    // 3. ��ȯ���� �ְ� �Ű������� �޴� �Լ� �����
	public static double addNum(double n1, double n2) {
				
			double result = 0.0;
            result = n1 + n2;			
			return result;
			
		
		
	}
	
	
	// 1.
	
	public static int intAdd(int n1,int n2,int n3) {
					
		     return n1 + n2 + n3;
		     
		}
	
	
	public static double doubleAdd(double d1,  double d2) {
		
			double sum = d1 + d2;
			return sum;
		
	}
	
	
	public static void printArticle(String article) {
		
		System.out.println(article);
	}
	
	
	
	
	// �Լ��� ����� ���ô�.
	
	// 1. ���ϰ� int , �Ű������� n1,n2,n3 �Լ��̸� : intAdd
	
	// 2.���ϰ� double �Ű����� d1, d2 �̸��� -> dobleAdd
	
	// 3. ���ϰ� ����, �Ű� ���� String article -- > �Լ��� �̸� : printArticle
	
	
	
	

	
	
	
} // end of class
